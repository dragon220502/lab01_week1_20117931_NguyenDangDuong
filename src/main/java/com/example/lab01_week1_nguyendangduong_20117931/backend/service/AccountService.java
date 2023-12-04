package com.example.lab01_week1_nguyendangduong_20117931.backend.service;

import com.example.lab01_week1_nguyendangduong_20117931.backend.models.Account;
import com.example.lab01_week1_nguyendangduong_20117931.backend.models.GrantAccess;
import com.example.lab01_week1_nguyendangduong_20117931.backend.respository.AccountRespository;
import org.checkerframework.checker.units.qual.A;

import java.util.List;
import java.util.Optional;

public class AccountService {
    private AccountRespository accountRespository;

    public AccountService() {
       accountRespository = new AccountRespository();
    }

    public boolean insertAccount(Account a){
        return accountRespository.insert(a);
    }
    public boolean updateAccount(Account a){
        return  accountRespository.update(a);
    }
    public Optional<Account> getAccount(String id, String password){
        Optional<Account> account = accountRespository.findAccountByIdAndPassword(id,password);
        return account;
    }

    public boolean deleteAccount(Account a){
        return accountRespository.delete(a);
    }
    public List<Account> getAllAccountByStatus(){
        List<Account> list = accountRespository.getAllByStatus();
        return list;
    }
   public List<Account> getAllAccountForRole(String role){
        List<Account> list = accountRespository.getAllAccountForRole(role);
        return list;
   }
    public Account findAccountById(String id){
        return  accountRespository.findAccountById(id);
    }

}
