package com.example.lab01_week1_nguyendangduong_20117931.backend.service;

import com.example.lab01_week1_nguyendangduong_20117931.backend.models.Role;
import com.example.lab01_week1_nguyendangduong_20117931.backend.respository.RoleRespository;

import java.util.List;

public class RoleService {
    private RoleRespository roleRespository;

    public RoleService() {
        roleRespository = new RoleRespository();

    }
    public boolean insertRole(Role role){
        return roleRespository.insert(role);
    }
    public boolean updateRole(Role role){
        return roleRespository.update(role);
    }
    public  boolean deleteRole(Role role){
        return  roleRespository.delete(role);
    }
    public List<Role> getAllRoleByStatus(){
        List<Role> roles = roleRespository.getAllByStatus();
        return roles;
    }
    public Role findRoleById(String id){
        return roleRespository.findById(id);
    }
}
