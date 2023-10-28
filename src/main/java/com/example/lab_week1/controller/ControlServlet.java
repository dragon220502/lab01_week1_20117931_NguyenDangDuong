package com.example.lab_week1.controller;


import com.example.lab_week1.service.AccountService;
import com.example.lab_week1.service.RoleService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.rmi.ServerException;

@WebServlet(urlPatterns = {"/ControlServlet"})
public class ControlServlet extends HttpServlet {
    private AccountService service;
    private RoleService roleService;

    public ControlServlet(AccountService service, RoleService roleService) {
        this.service = service;
        this.roleService = roleService;
    }

    protected void doPost(HttpServletRequest rep, HttpServletResponse resp) throws ServerException, IOException{};


}
