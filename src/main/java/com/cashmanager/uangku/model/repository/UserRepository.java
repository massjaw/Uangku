package com.cashmanager.uangku.model.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.cashmanager.uangku.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}