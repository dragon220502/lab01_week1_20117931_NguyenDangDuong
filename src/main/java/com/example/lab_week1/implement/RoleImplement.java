package com.example.lab_week1.implement;


import com.example.lab_week1.models.Role;
import com.example.lab_week1.repository.RoleRepository;
import com.example.lab_week1.service.RoleService;

import java.util.List;

public class RoleImplement implements RoleService {
    private RoleRepository roleRepository;

    public RoleImplement(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> getAll() {
        return roleRepository.getALL();
    }

    @Override
    public boolean create(Role a) {
        return roleRepository.createRole(a);
    }

    @Override
    public boolean update(Role b) {
        return roleRepository.updateRole(b);

    }

    @Override
    public Role findByID(String id) {
        return roleRepository.find(id);
    }
}
