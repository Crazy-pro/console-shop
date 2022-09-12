package alex.klimchuk.javacore.consoleshop.helper;

import alex.klimchuk.javacore.consoleshop.model.Catalog;
import alex.klimchuk.javacore.consoleshop.model.Product;
import alex.klimchuk.javacore.consoleshop.parser.Order;
import alex.klimchuk.javacore.consoleshop.model.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Copyright Alex Klimchuk (c) 2019.
 */
public interface CatalogSortingHelper {

    Map<String, List<Product>> sortCatalogByCriteria(Catalog catalog, LinkedHashMap<String, Order> sortingCriteriaMap);

}