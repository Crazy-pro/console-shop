package alex.klimchuk.javacore.consoleshop.loader;

import alex.klimchuk.javacore.consoleshop.model.Category;

import java.util.List;

/**
 * Copyright Alex Klimchuk (c) 2019.
 */
public interface CategoryLoader {

    List<Category> loadFromPackage(String packageForCategory);

}