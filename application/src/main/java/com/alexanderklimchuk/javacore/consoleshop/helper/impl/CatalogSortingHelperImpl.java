package com.alexanderklimchuk.javacore.consoleshop.helper.impl;

import com.alexanderklimchuk.javacore.consoleshop.comparator.ProductComparator;
import com.alexanderklimchuk.javacore.consoleshop.helper.CatalogSortingHelper;
import com.alexanderklimchuk.javacore.consoleshop.parser.Order;
import com.alexanderklimchuk.javacore.consoleshop.model.*;

import java.util.stream.Collectors;
import java.util.*;

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