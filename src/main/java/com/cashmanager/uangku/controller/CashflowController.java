package com.cashmanager.uangku.controller;

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
import com.cashmanager.uangku.model.entity.Cashflow;
import com.cashmanager.uangku.services.CashflowService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/cashflow")
public class CashflowController {
    
    @Autowired
    private CashflowService cashflowService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<ResponseData<Cashflow>> add(@Valid @RequestBody Cashflow cashflow, Errors errors){
        ResponseData<Cashflow> responseData = new ResponseData<>();

        if(errors.hasErrors()){
            for (ObjectError error : errors.getAllErrors()) {
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.setPayload(cashflowService.save(cashflow));
        return ResponseEntity.ok(responseData);
    }

    @GetMapping
    public Iterable<Cashflow> findAll(){
        return cashflowService.findAll();
    }


}
