package com.cashmanager.uangku.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cashmanager.uangku.model.User;
import com.cashmanager.uangku.model.Wallet;

import org.springframework.data.jpa.repository.Query;
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

@Query("SELECT u FROM m_user u where u.username = ?1")
List<User> findByUsername(String username);

@Query("SELECT c FROM user_cash c JOIN m_user u where u.username = ?1")
List<Wallet> findWalletUsername(String username);
}

