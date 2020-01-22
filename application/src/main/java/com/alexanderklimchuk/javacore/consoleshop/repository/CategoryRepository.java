package com.alexanderklimchuk.javacore.consoleshop.repository;

import com.alexanderklimchuk.javacore.consoleshop.model.Category;

import java.util.List;

public interface CategoryRepository {

    List<Category> findAll();

    void save(Category category);

}