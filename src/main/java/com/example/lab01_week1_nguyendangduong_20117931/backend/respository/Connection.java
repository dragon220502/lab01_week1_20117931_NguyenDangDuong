package com.example.lab01_week1_nguyendangduong_20117931.backend.respository;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Connection {
    private EntityManagerFactory emp;
    private static Connection connection;

    private  Connection() {
        emp = Persistence.createEntityManagerFactory("default");
    }
    public static Connection getConnection(){
        if(connection == null){
            connection = new Connection();
        }
        return connection;
    }

    public EntityManagerFactory getEmp() {
        return emp;
    }
}
