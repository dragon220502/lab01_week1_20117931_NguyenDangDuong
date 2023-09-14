package com.example.lab_week1.models;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
public class Log {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @ManyToOne
    private Account account;
    private LocalTime loginDate;
    private LocalTime logoutDate;

    private String note;

    public Log() {
    }

    public Log(Account account, LocalTime loginDate, LocalTime logoutDate, String note) {
        this.account = account;
        this.loginDate = loginDate;
        this.logoutDate = logoutDate;
        this.note = note;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public LocalTime getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(LocalTime loginDate) {
        this.loginDate = loginDate;
    }

    public LocalTime getLogoutDate() {
        return logoutDate;
    }

    public void setLogoutDate(LocalTime logoutDate) {
        this.logoutDate = logoutDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
