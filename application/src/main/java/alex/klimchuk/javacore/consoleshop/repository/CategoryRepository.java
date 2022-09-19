package alex.klimchuk.javacore.consoleshop.repository;

import alex.klimchuk.javacore.consoleshop.model.Category;

import java.util.List;

/**
 * Copyright Alex Klimchuk (c) 31.10.2019.
 */
public interface CategoryRepository {

    List<Category> findAll();

    void save(Category category);

}