package com.cashmanager.uangku.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;;


@Entity
@Table(name = "cash_flow")

public class Cashflow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @Column(name = "code")
    private String Code;

    @Column(name = "category_id")
    private Integer CategoryId;

    @Column(name = "user_id")
    private Integer UserId;

    @Column(name = "amount")
    private float Amount;

    public Cashflow(){

    }

    public Cashflow(Integer categoryId,Integer userId ,float amount, String code){
        this.CategoryId = categoryId;
        this.Amount = amount;
        this.UserId = userId;
        this.Code = code;
    }
}
