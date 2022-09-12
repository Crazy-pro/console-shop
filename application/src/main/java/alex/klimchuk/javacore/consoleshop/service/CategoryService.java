package alex.klimchuk.javacore.consoleshop.service;

import alex.klimchuk.javacore.consoleshop.model.Category;

import java.util.List;

/**
 * Copyright Alex Klimchuk (c) 2019.
 */
public interface CategoryService {

    List<Category> findAll();

    void save(Category category);

}