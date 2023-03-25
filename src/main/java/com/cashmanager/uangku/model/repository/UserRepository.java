package com.cashmanager.uangku.model.repository;



import org.springframework.data.repository.CrudRepository;

import com.cashmanager.uangku.model.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}