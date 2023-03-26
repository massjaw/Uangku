package com.cashmanager.uangku.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;


@Setter
@Getter
@Entity
@Table(name = "user_cash")

public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long Id;

    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User User;

    @Column(name = "balance")
    private double Balance = 0.0;


    public Wallet() {
        super();
    }

    public Wallet(long id, User user, double balance) {
        super();
        Id = id;
        this.User = user;
        Balance = balance;
    }

    

}
