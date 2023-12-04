package com.example.lab01_week1_nguyendangduong_20117931.backend.respository;

import com.example.lab01_week1_nguyendangduong_20117931.backend.enums.Status;
import com.example.lab01_week1_nguyendangduong_20117931.backend.models.Role;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class RoleRespository {
    private EntityManager em;
    private EntityTransaction trans;

    public RoleRespository() {
        em = Connection.getConnection().getEmp().createEntityManager();
        trans= em.getTransaction();

    }

    public boolean insert(Role r) {
        try {
            trans.begin();
            em.persist(r);
            trans.commit();
            return true;
        } catch (Exception ex) {
            trans.rollback();
            ex.printStackTrace();
        }
        return false;
    }
    public boolean update(Role r){
        try {
            trans.begin();
            em.merge(r);
            trans.commit();
            return true;
        }catch (Exception ex){
            trans.rollback();
            ex.printStackTrace();
        }
        return false;
    }
    public boolean delete(Role r){
        try {
            r.setStatus(Status.XOA);
            update(r);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public List<Role> getAllByStatus(){
        List<Role> roles = em.createNamedQuery("getAllRoleByStatus",Role.class).setParameter(1,Status.ACTIVE).getResultList();
        return roles;
    }

    public Role findById(String id){
        return em.find(Role.class,id);
    }
}
