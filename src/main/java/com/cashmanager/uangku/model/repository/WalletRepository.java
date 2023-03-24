package com.cashmanager.uangku.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cashmanager.uangku.model.entity.Wallet;

@Repository
public interface WalletRepository extends CrudRepository<Wallet, Float> {   


// @Query("SELECT c FROM user_cash c JOIN m_user u where u.username = ?1")
// Wallet findWalletUsername(String username);
}
