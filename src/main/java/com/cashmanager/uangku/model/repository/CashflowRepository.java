package com.cashmanager.uangku.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.cashmanager.uangku.model.entity.Cashflow;

public interface CashflowRepository extends CrudRepository<Cashflow, Long> {
    
}
