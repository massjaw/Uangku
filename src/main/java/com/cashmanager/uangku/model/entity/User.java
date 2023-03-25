package com.cashmanager.uangku.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;;

@Entity
@Table(name = "m_user")

public class User implements Serializable {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @NotEmpty(message = "username shouldn't empty")
    @Column(name = "username", length = 15, unique = true)
    private String Username;


    @NotEmpty(message = "password shouldn't empty")
    @Column(name = "password", length = 15)
    private String Password;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Wallet wallet;

    public User(){
        
    }

    public User(long id, String username,String password, Wallet wallet) {
        Id = id;
        Username = username;
        Password = password;
        this.wallet = wallet;
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

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    
    
}
