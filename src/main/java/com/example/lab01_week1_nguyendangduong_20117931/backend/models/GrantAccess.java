package com.example.lab01_week1_nguyendangduong_20117931.backend.models;

import com.example.lab01_week1_nguyendangduong_20117931.backend.enums.IsGrant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.A;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
        @Table(name = "grant_access")
@NamedQueries(@NamedQuery(name = "getAccountInRole",query = "select a from GrantAccess a where  a.account.accountId = ?1"))
public class GrantAccess {
    @Id
    @ManyToOne
    private Account account;
    @Id
    @ManyToOne
    private Role grantAccess;
    @Column(name = "is_grant", columnDefinition = "tinyint(3)")
    @Enumerated(EnumType.ORDINAL)
    private IsGrant isGrant;
}
