package com.cashmanager.uangku.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cashmanager.uangku.model.entity.Cashflow;

public interface CashflowRepository extends JpaRepository<Cashflow, Long> {
    
}
