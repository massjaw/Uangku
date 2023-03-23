package com.cashmanager.uangku.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "category")

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @Column(name = "name")
    private String CategoryName;

    public Category() {

    }
    public Category(long id, String categoryName) {
        this.Id = id;
        this.CategoryName = categoryName;
    }

    public long getId(){
        return Id;
    }

    public String getCategoryName(){
        return CategoryName;
    }

    public void setCategoryName(String categoryName){
        this.CategoryName = categoryName;
    }

}
