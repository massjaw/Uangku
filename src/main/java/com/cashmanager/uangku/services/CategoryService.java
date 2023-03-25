package com.cashmanager.uangku.services;

import com.cashmanager.uangku.model.entity.Category;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cashmanager.uangku.model.repository.CategoryRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Iterable<Category> findCategories() {
        return categoryRepository.findAll();
    }

    public Category findOne(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        if (!category.isPresent()){
            return null;
        }
        return category.get();
    }

    public void removeOne(Long id) {
        categoryRepository.deleteById(id);
    }

}
