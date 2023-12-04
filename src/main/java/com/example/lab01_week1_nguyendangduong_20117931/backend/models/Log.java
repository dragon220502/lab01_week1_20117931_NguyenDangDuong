package com.example.lab01_week1_nguyendangduong_20117931.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Log {
    private int logId;
    private String accountId;
    private LocalDate loginTime;
    private LocalDate logoutTime;
    private String notes;

}
