package com.alexanderklimchuk.javacore.consoleshop.helper;

import com.alexanderklimchuk.javacore.consoleshop.model.Category;

import java.math.BigDecimal;

public interface SumOfTopFiveProductsHelper {

    BigDecimal sumOfTopFiveProductsPrices(Category category);

}