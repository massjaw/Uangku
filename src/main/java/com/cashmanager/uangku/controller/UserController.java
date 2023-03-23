package com.cashmanager.uangku.controller;


import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.MediaType;

import com.cashmanager.uangku.model.User;
// import com.cashmanager.uangku.repository.UserRepository;


// import org.springframework.security.core.Authentication;

@RestController
@RequestMapping("/api")
public class UserController {
    
    @PostMapping(path = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String login(@RequestBody User user){
        return user.toString();
    }
}
