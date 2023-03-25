package com.cashmanager.uangku.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.io.Serializable;

import jakarta.persistence.Column;

@Entity
@Table(name = "m_category")

public class Category implements Serializable {
    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @NotEmpty(message = "category name shouldn't empty")
    @Column(name = "name")
    private String CategoryName;

    public Category() {

    }

    public Category(long id, String categoryName) {
        Id = id;
        CategoryName = categoryName;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }
    
    

}
