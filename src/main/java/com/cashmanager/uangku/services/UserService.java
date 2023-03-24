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

    public User creatUser(User user){
        return userRepository.save(user);
    }

    public User findUser(long Id){
        return userRepository.findById(Id).get();
    }

}
