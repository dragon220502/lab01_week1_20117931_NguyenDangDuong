package com.example.lab01_week1_nguyendangduong_20117931.backend.models;

import com.example.lab01_week1_nguyendangduong_20117931.backend.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
        @Table(name = "account")
@NamedQueries(
        {@NamedQuery(name = "getAllAccountByStatus", query = "select account from Account account where account.status = ?1"),
                @NamedQuery(name = "getAccountByAccountIdAndPassword", query = "SELECT a FROM Account a WHERE a.accountId = :accountId AND a.passWord = :password"),
                @NamedQuery(name = "getAccountForRole",query = "select a from  GrantAccess g join Account  a on g.account.accountId = a.accountId where g.grantAccess.roleId = ?1")

})
public class Account {
    @Id
    @Column(name = "acount_id" ,columnDefinition = "varchar(50)")
    private String accountId;
    @Column(name = "full_name" ,columnDefinition = "varchar(50)")
    private String fullName;
    @Column(name = "password" ,columnDefinition = "varchar(50)")
    private String passWord;
    @Column(name = "email" ,columnDefinition = "varchar(50)")
    private String email;
    @Column(name = "phone" ,columnDefinition = "varchar(50)")
    private String phone;
    @Column(name = "status" ,columnDefinition = "tinyint(3)")
    @Enumerated(EnumType.ORDINAL)
    private Status status;

    public Account(String fullName, String passWord, String email, String phone, Status status) {
        this.fullName = fullName;
        this.passWord = passWord;
        this.email = email;
        this.phone = phone;
        this.status = status;
    }
}
