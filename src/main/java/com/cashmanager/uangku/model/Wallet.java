package com.cashmanager.uangku.model;


import jakarta.persistence.*;


@Entity
@Table(name = "user_cash")

public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @Column(name = "user_id")
    private long UserId;

    @Column(name = "balance")
    private float Balance;

    public Wallet() {

    }

    public Wallet(long userId, float balance){
        this.UserId = userId;
        this.Balance = balance;
    }

    public long getId(){
        return Id;
    }

    public float getBalance(){
        return Balance;
    }

    @Override
	public String toString() {
		return "Wallet [user id =" + UserId + ", balance =" + Balance + "]";
	}
}
