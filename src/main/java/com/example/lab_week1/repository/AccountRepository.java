package com.example.lab_week1.repository;


import com.example.lab_week1.models.Account;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class AccountRepository {
    private EntityManager entityManager;
    private EntityTransaction tran;
    public AccountRepository(){
        entityManager = Connection.getInstance().getEmf().createEntityManager();
    }
    public boolean createAccount(Account account){
        tran = entityManager.getTransaction();
        tran.begin();
        try {
            entityManager.persist(account);
            tran.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            tran.rollback();
        }
        return false;
    }
    public boolean updateAccount(Account account){
        tran = entityManager.getTransaction();
        tran.begin();
        try {
            entityManager.merge(account);
            tran.commit();
        }catch (Exception e){
            e.printStackTrace();
            tran.rollback();
        }
        return false;


    }
    public List<Account> getALL(){
        List<Account> list = entityManager.createQuery("select account from Account account").getResultList();
        return list;
    }
    public Account find(String id){
        Account findAccount = (Account) entityManager.createQuery("select a from Account a").getSingleResult();
        return findAccount;
    }
}
