package com.cashmanager.uangku.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.cashmanager.uangku.model.entity.Wallet;

public interface WalletRepository extends CrudRepository<Wallet, Long> {
    
}
