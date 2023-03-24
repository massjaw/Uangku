package com.cashmanager.uangku.controller;


import org.springframework.web.bind.annotation.RestController;

import com.cashmanager.uangku.model.entity.User;
import com.cashmanager.uangku.services.UserService;

// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.MediaType;


// import org.springframework.security.core.Authentication;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User register(@RequestBody User user){
        return userService.creatUser(user);
    }

    @PostMapping(path = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String login(@RequestBody User user){
        return user.toString();
    }

    @PutMapping(path = "/profile", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String updateUseString(@RequestBody User user){
        return user.toString();
    }
}
