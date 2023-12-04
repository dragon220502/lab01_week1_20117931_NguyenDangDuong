package com.example.lab01_week1_nguyendangduong_20117931.fontend.controller;


import com.example.lab01_week1_nguyendangduong_20117931.backend.enums.Status;
import com.example.lab01_week1_nguyendangduong_20117931.backend.models.Account;
import com.example.lab01_week1_nguyendangduong_20117931.backend.models.Mess;
import com.example.lab01_week1_nguyendangduong_20117931.backend.models.Role;
import com.example.lab01_week1_nguyendangduong_20117931.backend.service.AccountService;
import com.example.lab01_week1_nguyendangduong_20117931.backend.service.RoleService;
import com.example.lab01_week1_nguyendangduong_20117931.fontend.model.AccountModel;
import com.example.lab01_week1_nguyendangduong_20117931.fontend.model.RoleModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@WebServlet("/controller")
public class Controller extends HttpServlet {
    private AccountModel accountModel = new AccountModel();
    private AccountService accountService = new AccountService();
    private RoleService roleService = new RoleService();

//    @Override
//    public void init() throws ServletException {
//        Account account = new Account("duong222","abc","123456","abc@gmail.com","9976629", Status.ACTIVE);
//        Account account2= new Account("duong223","abc","123456","abc@gmail.com","9976629", Status.ACTIVE);
//        Account account3 = new Account("duong224","abc","123456","abc@gmail.com","9976629", Status.ACTIVE);
//        Role role = new Role("123","abc","abc",Status.ACTIVE);
//        Role role2 = new Role("1234","abc","abc",Status.ACTIVE);
//        Role role3 = new Role("1235","abc","abc",Status.ACTIVE);
//        accountService.insertAccount(account);
//        accountService.insertAccount(account2);
//        accountService.insertAccount(account3);
//        roleService.insertRole(role);
//        roleService.insertRole(role2);
//        roleService.insertRole(role3);
//    }

    @Override
    protected void doPost(HttpServletRequest rep, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Object option = rep.getParameter("action");
            if (option!=null) {
                if (option.equals("insert")) {
                    accountModel.insertAccount(rep, resp);

                }
                else if (option.equals("update")) {
                    String id = rep.getParameter("id");
                    accountModel.updateAccount(rep, resp);
                }

                else if (option.equals("login")) {
                    String id = rep.getParameter("id");
                    String password = rep.getParameter("password");
                    Optional<Account> account = accountModel.getAccount(id, password);
                    if(account.isPresent()){
                        rep.setAttribute("acc",account.get());
                        rep.getRequestDispatcher("accountListOne.jsp").forward(rep, resp);
                    }

                }
                else if(option.equals("list")){
                    accountModel.getAccountByRole(rep,resp);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Object option = req.getParameter("action");
            if (option != null) {
                if (option.equals("delete")) {
                    String id = req.getParameter("id");
                    accountModel.deleteAccounnt(req, resp);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
