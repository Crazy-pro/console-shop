package alex.klimchuk.javacore.consoleshop.helper;

import alex.klimchuk.javacore.consoleshop.model.Catalog;
import alex.klimchuk.javacore.consoleshop.model.Category;
import alex.klimchuk.javacore.consoleshop.model.Product;
import alex.klimchuk.javacore.consoleshop.model.*;

import java.util.List;
import java.util.Map;

/**
 * Copyright Alex Klimchuk (c) 2019.
 */
public interface CatalogInputOutputHelper {

    Catalog createCatalog();

    Category createCategory();

    Product createProduct(Long categoryId);

    void displayCatalog(Map<String, List<Product>> catalog);

}