package com.alexanderklimchuk.javacore.consoleshop.loader;

import com.alexanderklimchuk.javacore.consoleshop.model.Category;

import java.util.List;

public interface CategoryLoader {

    List<Category> loadFromPackage(String packageForCategory);

}