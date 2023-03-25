package com.cashmanager.uangku.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;


@Setter
@Getter
@Entity
@Table(name = "user_cash")

public class Wallet {
    @Id
    @Column(name = "user_id",nullable = false, updatable = false)
    private long Id;

    @Column(name = "balance")
    private double Balance = 0.0;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    public Wallet() {

    }

}
