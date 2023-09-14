package com.example.lab_week1.implement;

import com.example.lab_week1.models.Account;
import com.example.lab_week1.repository.AccountRepository;
import com.example.lab_week1.service.AccountService;

import java.util.List;

public class AccountImplement implements AccountService {
    private AccountRepository accountRepository;
    public AccountImplement(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> getAlL() {
        return accountRepository.getALL();
    }

    @Override
    public Account findById(String id) {
        return accountRepository.find(id);
    }

    @Override
    public boolean create(Account a) {
        return accountRepository.createAccount(a);
    }

    @Override
    public boolean update(Account b) {
        return accountRepository.updateAccount(b);

    }

}
