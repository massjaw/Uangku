package com.cashmanager.uangku.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cashmanager.uangku.model.entity.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
    
}
