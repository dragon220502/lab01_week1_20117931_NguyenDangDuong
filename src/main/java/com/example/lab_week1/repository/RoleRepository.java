package com.example.lab_week1.repository;


import com.example.lab_week1.models.Role;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class RoleRepository {
    private EntityManager em;
    private EntityTransaction tran;

    public RoleRepository(){
        em = Connection.getInstance().getEmf().createEntityManager();
    }
    public boolean createRole(Role a){
        tran = em.getTransaction();
        tran.begin();
        try {
            em.persist(a);
            tran.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            tran.rollback();
        }
        return false;

    }
    public boolean updateRole(Role a){
        tran = em.getTransaction();
        tran.begin();
        try {
            em.merge(a);
            tran.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            tran.rollback();
        }
        return false;
    }
    public List<Role> getALL(){
        List<Role> l = em.createQuery("select a from Role  a").getResultList();
        return l;
    }
    public Role find(String id){
        Role ll = (Role) em.createQuery("select a from Rolea where a.role_id="+id).getSingleResult();
        return ll;
    }
}

