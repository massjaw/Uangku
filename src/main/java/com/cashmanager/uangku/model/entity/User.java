package com.cashmanager.uangku.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.io.Serializable;

import jakarta.persistence.Column;;

@Entity
@Table(name = "m_user")

public class User implements Serializable {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "username", length = 15, unique = true)
    private String Username;

    @Column(name = "password", length = 15)
    private String Password;

    public User() {

    }

    public User(long id, String username, String password) {
        this.Id = id;
        this.Username = username;
        this.Password = password;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    

    
}
