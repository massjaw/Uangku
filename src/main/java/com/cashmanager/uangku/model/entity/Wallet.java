package com.cashmanager.uangku.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;


@Entity
@Table(name = "user_cash")

public class Wallet {
    @Id
    @Column(name = "user_id",nullable = false, updatable = false)
    private long Id;

    @Column(name = "balance")
    private double Balance;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    public Wallet() {

    }

    public Wallet(long id, double balance, User user) {
        Id = id;
        Balance = balance;
        this.user = user;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    

    

}
