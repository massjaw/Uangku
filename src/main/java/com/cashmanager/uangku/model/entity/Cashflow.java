package com.cashmanager.uangku.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;


@Entity
@Table(name = "cash_flow")

public class Cashflow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

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

    

    public Cashflow(long id, String code, Integer categoryId, Integer userId, double amount,
            com.cashmanager.uangku.model.entity.User user, com.cashmanager.uangku.model.entity.Category category) {
        Id = id;
        Code = code;
        Amount = amount;
        User = user;
        Category = category;
    }



    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }


    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public User getUser() {
        return User;
    }

    public void setUser(User user) {
        User = user;
    }

    public Category getCategory() {
        return Category;
    }

    public void setCategory(Category category) {
        Category = category;
    }

    

}
