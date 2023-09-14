package com.example.lab_week1.service;

import com.example.lab_week1.models.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAll();
    Role findByID(String id);
    boolean create(Role a);
    boolean update(Role b);
}
