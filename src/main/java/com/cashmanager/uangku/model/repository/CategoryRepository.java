package com.cashmanager.uangku.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cashmanager.uangku.model.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}