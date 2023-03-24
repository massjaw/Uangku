package com.cashmanager.uangku.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cashmanager.uangku.model.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {


// @Query("SELECT u FROM m_user u where u.username = ?1")
// User findByUsername(String username);


}

