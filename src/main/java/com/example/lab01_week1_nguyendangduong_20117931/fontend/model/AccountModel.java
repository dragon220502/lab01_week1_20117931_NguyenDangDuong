package com.example.lab01_week1_nguyendangduong_20117931.fontend.model;

import com.example.lab01_week1_nguyendangduong_20117931.backend.enums.Status;
import com.example.lab01_week1_nguyendangduong_20117931.backend.models.Account;
import com.example.lab01_week1_nguyendangduong_20117931.backend.models.GrantAccess;
import com.example.lab01_week1_nguyendangduong_20117931.backend.service.AccountService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class AccountModel {
    private AccountService accountService;

    public AccountModel() {
        accountService = new AccountService();
    }
    public void insertAccount(HttpServletRequest rep, HttpServletResponse resp){
        try {
            String fullname = rep.getParameter("fullname");
            String password = rep.getParameter("password");
            String email = rep.getParameter("email");
            String phone = rep.getParameter("phone");
            String status = rep.getParameter("status");
            String id = rep.getParameter("id");
            Account account = new Account(id,fullname,password,email,phone, Status.valueOf(status));
            accountService.insertAccount(account);
            System.out.println(account);
            resp.sendRedirect("listAccount.jsp");
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
    public void updateAccount(HttpServletRequest rep,HttpServletResponse resp) throws ServletException, IOException {

            String fullname = rep.getParameter("fullname");
            String password = rep.getParameter("password");
            String email = rep.getParameter("email");
            String phone = rep.getParameter("phone");
            String status = rep.getParameter("status");
            String id = rep.getParameter("id");


            Account account = accountService.findAccountById(id);
            account.setFullName(fullname);
            account.setPassWord(password);
            account.setEmail(email);
            account.setPhone(phone);
            account.setStatus(Status.valueOf(status));

            accountService.updateAccount(account);
            resp.sendRedirect("listAccount.jsp");

    }
    public void deleteAccounnt(HttpServletRequest rep, HttpServletResponse resp) throws ServletException, IOException {

            String id = rep.getParameter("id");
            Account account = accountService.findAccountById(id);
            accountService.deleteAccount(account);
            rep.getRequestDispatcher("listAccount.jsp").forward(rep,resp);


    }
    public void getAccountByRole(HttpServletRequest rep, HttpServletResponse resp) throws IOException, ServletException {
        // Lấy tất cả kinh nghiệm của các ứng viên theo vai trò thông qua ExperienceService và chuyển đến trang report1.jsp
        String role=rep.getParameter("enum");
        List<Account> ex = accountService.getAllAccountForRole(role);
        rep.setAttribute("listAccount",ex);
        rep.getRequestDispatcher("listRole.jsp").forward(rep,resp);
    }
    public Optional<Account> getAccount(String id, String password) {
        return accountService.getAccount(id,password);
    }
}
