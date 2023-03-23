package com.cashmanager.uangku.model;


import jakarta.persistence.*;

@Entity
@Table(name = "m_user")

public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @Column(name = "username")
    private String Username;

    @Column(name = "password")
    private String Password;

    public User() {

    }

    public User(String username, String password) {
        this.Password = password;
        this.Username = username;
    }

    public long getId(){
        return Id;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public String getUsername() {
        return Username;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getPassword() {
        return Password;
    }

    @Override
	public String toString() {
		return "User [id=" + Id + ", username=" + Username + ", password=" + Password + "]";
	}
}
