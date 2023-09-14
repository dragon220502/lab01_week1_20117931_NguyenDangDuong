package com.example.lab_week1.models;



public enum Status {
    ACTIIVE(1),
    DEACTIVE(0),
    DELETE(-1);
    private final int value;

    Status(int value) {
        this.value = value;

    }

    public int getValue() {
        return value;
    }
}
