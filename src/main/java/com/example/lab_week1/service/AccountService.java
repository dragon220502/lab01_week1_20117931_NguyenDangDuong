package com.example.lab_week1.service;


import com.example.lab_week1.models.Account;

import java.util.List;

public interface AccountService {
    List<Account>getAlL();
    Account findById(String id);

    boolean create(Account a);
    boolean update (Account b);
}
