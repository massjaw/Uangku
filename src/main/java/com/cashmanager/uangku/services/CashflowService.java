package com.cashmanager.uangku.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cashmanager.uangku.model.entity.Cashflow;
import com.cashmanager.uangku.model.repository.CashflowRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CashflowService {

    @Autowired
    private CashflowRepository cashflowRepository;

    public Cashflow save(Cashflow cashflow){
        return cashflowRepository.save(cashflow);
    }

    public Cashflow findOne(Long id){
        Optional<Cashflow> cashflow = cashflowRepository.findById(id);
        if(!cashflow.isPresent()){
            return null;
        }
        return cashflow.get();
    }

    public Iterable<Cashflow> findAll(){
        return cashflowRepository.findAll();
    }
    
}
