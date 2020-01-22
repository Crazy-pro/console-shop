package com.alexanderklimchuk.javacore.consoleshop.service;

import com.alexanderklimchuk.javacore.consoleshop.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();

    void save(Category category);

}