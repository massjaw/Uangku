package com.cashmanager.uangku.model.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cashmanager.uangku.model.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    
}
