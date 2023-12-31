package com.example.lab_week1.models;


import jakarta.persistence.*;

@Entity
@Table(name = "Grant_Access")
public class GrantAccess {
    @Id
    @ManyToOne
    private Account account;
    @Id
    @ManyToOne
    private Role role;
    private String note;
    @Column(name = "is_grant")
    @Enumerated(EnumType.ORDINAL)

    private GrantStatus grantStatus;

    public GrantAccess() {
    }

    public GrantAccess(Account account, Role role, String note, GrantStatus grantStatus) {
        this.account = account;
        this.role = role;
        this.note = note;
        this.grantStatus = grantStatus;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public GrantStatus getGrantStatus() {
        return grantStatus;
    }

    public void setGrantStatus(GrantStatus grantStatus) {
        this.grantStatus = grantStatus;
    }
}
