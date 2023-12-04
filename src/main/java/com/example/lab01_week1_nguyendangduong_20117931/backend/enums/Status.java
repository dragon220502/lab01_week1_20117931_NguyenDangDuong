package com.example.lab01_week1_nguyendangduong_20117931.backend.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.checkerframework.checker.units.qual.A;

@AllArgsConstructor
@Getter
public enum Status {
    DEACTIVE(0),
    ACTIVE(1),
    XOA(-1);
    private int status;
}
