package com.example.lab_week1.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Role {
    @Id
    private String role_Id;
    private String role_Name;
    private String description;
    private Status status;

    public Role() {
    }

    public Role(String role_Id, String role_Name, String description, Status status) {
        this.role_Id = role_Id;
        this.role_Name = role_Name;
        this.description = description;
        this.status = status;
    }

    public String getRole_Id() {
        return role_Id;
    }

    public void setRole_Id(String role_Id) {
        this.role_Id = role_Id;
    }

    public String getRole_Name() {
        return role_Name;
    }

    public void setRole_Name(String role_Name) {
        this.role_Name = role_Name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
