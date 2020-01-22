package com.alexanderklimchuk.javacore.consoleshop.helper;

import com.alexanderklimchuk.javacore.consoleshop.model.*;

import java.util.List;
import java.util.Map;

public interface CatalogInputOutputHelper {

    Catalog createCatalog();

    Category createCategory();

    Product createProduct(Long categoryId);

    void displayCatalog(Map<String, List<Product>> catalog);

}