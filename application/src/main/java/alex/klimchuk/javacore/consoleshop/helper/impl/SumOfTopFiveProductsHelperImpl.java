package alex.klimchuk.javacore.consoleshop.helper.impl;

import alex.klimchuk.javacore.consoleshop.helper.SumOfTopFiveProductsHelper;
import alex.klimchuk.javacore.consoleshop.model.Category;
import alex.klimchuk.javacore.consoleshop.model.Product;
import alex.klimchuk.javacore.consoleshop.model.*;

import java.math.BigDecimal;
import java.util.Comparator;

/**
 * Copyright Alex Klimchuk (c) 31.10.2019.
 */
public class SumOfTopFiveProductsHelperImpl implements SumOfTopFiveProductsHelper {

    private static final int TOP_QUANTITY = 5;

    @Override
    public BigDecimal sumOfTopFiveProductsPrices(Category category) {
        return category.getProducts()
                .stream()
                .map(Product::getPrice)
                .sorted(Comparator.reverseOrder())
                .limit(TOP_QUANTITY)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
