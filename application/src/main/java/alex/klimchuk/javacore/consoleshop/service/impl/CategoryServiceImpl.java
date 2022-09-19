package alex.klimchuk.javacore.consoleshop.service.impl;

import alex.klimchuk.javacore.consoleshop.model.Category;
import alex.klimchuk.javacore.consoleshop.repository.CategoryRepository;
import alex.klimchuk.javacore.consoleshop.service.CategoryService;

import java.util.List;

/**
 * Copyright Alex Klimchuk (c) 31.10.2019.
 */
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