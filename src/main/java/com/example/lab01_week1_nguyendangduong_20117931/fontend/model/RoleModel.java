package com.example.lab01_week1_nguyendangduong_20117931.fontend.model;

import com.example.lab01_week1_nguyendangduong_20117931.backend.enums.Status;
import com.example.lab01_week1_nguyendangduong_20117931.backend.models.Role;
import com.example.lab01_week1_nguyendangduong_20117931.backend.service.RoleService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RoleModel {
    private RoleService roleService;

    public RoleModel() {
        roleService = new RoleService();

    }
    public void insertRole(HttpServletRequest rep,HttpServletResponse resp){
        try {
            String roleName = rep.getParameter("rolename");
            String description = rep.getParameter("description");
            String status = rep.getParameter("status");

            Role role = new Role(roleName,description, Status.valueOf(status));
            roleService.insertRole(role);
            resp.sendRedirect("listRole.jsp");
        }catch (Exception e){
            throw new RuntimeException("Cant insert Role");
        }
    }
    public void updateRole(HttpServletRequest rep, HttpServletResponse resp){
        try {
            String roleName = rep.getParameter("rolename");
            String description = rep.getParameter("description");
            String status = rep.getParameter("status");
            String id = rep.getParameter("id");
            Role role = roleService.findRoleById(id);

            role.setRoleName(roleName);
            role.setDescription(description);
            role.setStatus(Status.valueOf(status));

            roleService.updateRole(role);
            resp.sendRedirect("listRole.jsp");
        }catch (Exception ex){
            throw new RuntimeException("Cant update role");
        }
    }
    public void deleteRole(HttpServletRequest rep,HttpServletResponse resp){
        try {
            String id = rep.getParameter("id");
            Role role= roleService.findRoleById(id);
            roleService.deleteRole(role);
            resp.sendRedirect("listRole.jsp");
        }catch (Exception ex){
            throw new RuntimeException("Cant delete role");
        }

    }
}
