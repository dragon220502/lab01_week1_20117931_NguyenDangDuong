package com.example.lab01_week1_nguyendangduong_20117931.backend.models;

import com.example.lab01_week1_nguyendangduong_20117931.backend.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
    @Table(name = "role")
@NamedQueries(@NamedQuery(name = "getAllRoleByStatus" , query = "select role from Role role where role.status = ?1"))
public class Role {
    @Id
    @Column(name = "role_id" ,columnDefinition = "varchar(50)")
    private String roleId;
    @Column(name = "role_name" ,columnDefinition = "varchar(50)")
    private String roleName;
    @Column(name = "description" ,columnDefinition = "varchar(50)")
    private String description;
    @Column(name = "status",columnDefinition = "tinyint(3)")
    @Enumerated(EnumType.ORDINAL)
    private Status status;

    public Role(String roleName, String description, Status status) {
        this.roleName = roleName;
        this.description = description;
        this.status = status;
    }
}
