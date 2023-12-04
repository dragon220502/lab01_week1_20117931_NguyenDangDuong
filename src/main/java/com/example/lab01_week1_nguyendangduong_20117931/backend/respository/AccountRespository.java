package com.example.lab01_week1_nguyendangduong_20117931.backend.respository;

import com.example.lab01_week1_nguyendangduong_20117931.backend.enums.Status;
import com.example.lab01_week1_nguyendangduong_20117931.backend.models.Account;
import com.example.lab01_week1_nguyendangduong_20117931.backend.models.GrantAccess;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;
import java.util.Optional;


public class AccountRespository {
    private EntityManager em;
    private EntityTransaction trans;

    public AccountRespository() {
        em = Connection.getConnection().getEmp().createEntityManager();
        trans = em.getTransaction();
    }
    public boolean insert(Account a){
        try {
            trans.begin();
            em.persist(a);
            trans.commit();
            return true;
        }catch (Exception ex){
            trans.rollback();
            ex.printStackTrace();
        }
        return false;
    }
    public boolean update(Account a){
        try {
            trans.begin();
            em.merge(a);
            trans.commit();
            return true;
        }catch (Exception ex){
            trans.rollback();
            ex.printStackTrace();
        }
        return false;
    }
    public boolean delete(Account a){
        try {
            a.setStatus(Status.DEACTIVE);
            update(a);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public List<Account> getAllByStatus(){
        return em.createNamedQuery("getAllAccountByStatus", Account.class).setParameter(1,Status.ACTIVE).getResultList();
    }
    public Account findAccountById(String id){
        return em.find(Account.class,id);
    }

    public Optional<Account> findAccountByIdAndPassword(String id, String password){
        Optional<Account> account = Optional.ofNullable(em.createNamedQuery("getAccountByAccountIdAndPassword", Account.class).setParameter("accountId", id).setParameter("password", password).getSingleResult());
        return account;
    }
    public List<Account> getAllAccountForRole(String role){
        return em.createNamedQuery("getAccountForRole", Account.class).setParameter(1,role).getResultList();
    }
}
