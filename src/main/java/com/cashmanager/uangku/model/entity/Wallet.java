package com.cashmanager.uangku.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.FetchType;


@Entity
@Table(name = "user_cash")

public class Wallet {
    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long Id;

    @Column(name = "user_id")
    private long UserId;

    @Column(name = "balance")
    private double Balance;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User User;

    public Wallet() {

    }

    public Wallet(long id, long userId, double balance, User user) {
        this.Id = id;
        this.UserId = userId;
        this.Balance = balance;
        this.User = user;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(float balance) {
        Balance = balance;
    }

    public User getUser() {
        return User;
    }

    public void setUser(User user) {
        this.User = user;
    }

    
}
