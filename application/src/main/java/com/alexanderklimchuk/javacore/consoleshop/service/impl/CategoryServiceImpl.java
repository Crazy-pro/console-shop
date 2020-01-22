package com.alexanderklimchuk.javacore.consoleshop.service.impl;

import com.alexanderklimchuk.javacore.consoleshop.repository.CategoryRepository;
import com.alexanderklimchuk.javacore.consoleshop.service.CategoryService;
import com.alexanderklimchuk.javacore.consoleshop.model.Category;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

}