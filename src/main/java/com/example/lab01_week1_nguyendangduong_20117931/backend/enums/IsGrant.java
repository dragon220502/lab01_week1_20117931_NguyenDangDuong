package com.example.lab01_week1_nguyendangduong_20117931.backend.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum IsGrant {
    DIASABLE(0),
    ENABLE(1);
    private int isGrant;
}
