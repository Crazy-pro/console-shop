package com.alexanderklimchuk.javacore.consoleshop.helper;

import com.alexanderklimchuk.javacore.consoleshop.parser.Order;
import com.alexanderklimchuk.javacore.consoleshop.model.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface CatalogSortingHelper {

    Map<String, List<Product>> sortCatalogByCriteria(Catalog catalog, LinkedHashMap<String, Order> sortingCriteriaMap);

}