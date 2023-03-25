package com.cashmanager.uangku.controller;

import java.util.List;
import java.util.Locale.Category;

import javax.management.RuntimeErrorException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cashmanager.uangku.dto.ResponseData;
import com.cashmanager.uangku.services.CategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;

    @PostMapping(path = "/category", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<ResponseData<Category>> register(@Valid @RequestBody Category category, Errors errors){

    ResponseData<Category> responseData = new ResponseData<>();

        if(errors.hasErrors()){
            for (ObjectError error : errors.getAllErrors()) {
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.setPayload(categoryService.createCategory(category));
        return ResponseEntity.ok(responseData);
    }

    

}
