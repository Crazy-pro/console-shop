package alex.klimchuk.javacore.consoleshop.helper.impl;

import alex.klimchuk.javacore.consoleshop.comparator.ProductComparator;
import alex.klimchuk.javacore.consoleshop.helper.CatalogSortingHelper;
import alex.klimchuk.javacore.consoleshop.model.Catalog;
import alex.klimchuk.javacore.consoleshop.model.Category;
import alex.klimchuk.javacore.consoleshop.model.Product;
import alex.klimchuk.javacore.consoleshop.parser.Order;
import alex.klimchuk.javacore.consoleshop.model.*;

import java.util.stream.Collectors;
import java.util.*;

/**
 * Copyright Alex Klimchuk (c) 31.10.2019.
 */
public class CatalogSortingHelperImpl implements CatalogSortingHelper {

    @Override
    public Map<String, List<Product>> sortCatalogByCriteria(Catalog catalog, LinkedHashMap<String, Order> sortingCriteriaMap) {
        Comparator<Product> comparator = new ProductComparator(sortingCriteriaMap);
        return catalog.getCategories()
                .stream()
                .collect(Collectors.toMap(
                        Category::getName,
                        category -> category.getProducts()
                                .stream()
                                .sorted(comparator)
                                .collect(Collectors.toList())));
    }

}
