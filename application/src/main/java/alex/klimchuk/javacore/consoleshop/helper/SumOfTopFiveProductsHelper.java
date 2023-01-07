package alex.klimchuk.javacore.consoleshop.helper;

import alex.klimchuk.javacore.consoleshop.model.Category;

import java.math.BigDecimal;

/**
 * Copyright Alex Klimchuk (c) 31.10.2019.
 */
public interface SumOfTopFiveProductsHelper {

    BigDecimal sumOfTopFiveProductsPrices(Category category);

}
