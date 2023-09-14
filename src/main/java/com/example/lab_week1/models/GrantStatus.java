package com.example.lab_week1.models;

public enum GrantStatus {
    DISABLED(0),
    ENABLED(1);

    private final int values;

    GrantStatus(int values){
        this.values = values;

    }
    public  int getValues(){
        return values;
    }
}
