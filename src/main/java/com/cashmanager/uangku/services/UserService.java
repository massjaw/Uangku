package com.cashmanager.uangku.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cashmanager.uangku.model.repository.UserRepository;
import com.cashmanager.uangku.model.entity.User;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public User save(User user){ //create and update
        return userRepository.save(user);
    }

    public User findUser(long id){
        return userRepository.findById(id).get();
    }

    public void deleteUser(long id){
        userRepository.deleteById(id);
    }

}
