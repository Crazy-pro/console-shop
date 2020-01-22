package com.alexanderklimchuk.javacore.consoleshop.helper.impl;

import com.alexanderklimchuk.javacore.consoleshop.helper.SumOfTopFiveProductsHelper;
import com.alexanderklimchuk.javacore.consoleshop.model.*;

import java.math.BigDecimal;
import java.util.Comparator;

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