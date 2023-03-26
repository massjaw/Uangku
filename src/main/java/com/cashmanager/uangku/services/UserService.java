package com.cashmanager.uangku.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cashmanager.uangku.model.repository.UserRepository;
import com.cashmanager.uangku.model.repository.WalletRepository;
import com.cashmanager.uangku.dto.WalletDto;
import com.cashmanager.uangku.model.entity.User;
import com.cashmanager.uangku.model.entity.Wallet;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    private WalletRepository walletRepository;

    public User creatUser(User user){ //create and update
        User userResponse = userRepository.save(user);
        System.out.println(userResponse);
        Wallet walletRes = new Wallet();
        walletRes.setUser(userResponse);
        walletRes.setBalance(1000);
        System.out.println(walletRepository.save(walletRes));
        return userResponse;
    }

    public User findUser(long id){
        return userRepository.findById(id).get();
    }

    public void deleteUser(long id){
        userRepository.deleteById(id);
    }

}
