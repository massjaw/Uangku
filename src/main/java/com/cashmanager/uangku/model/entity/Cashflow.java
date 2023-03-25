package com.cashmanager.uangku.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;

@Setter
@Getter
@Entity
@Table(name = "cash_flow")

public class Cashflow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "code")
    private String Code;


    @Column(name = "amount")
    private double Amount;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User User;

    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category Category;

    public Cashflow(){

    }
}
