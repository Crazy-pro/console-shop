package alex.klimchuk.javacore.consoleshop.helper;

import alex.klimchuk.javacore.consoleshop.model.Catalog;
import alex.klimchuk.javacore.consoleshop.model.Category;
import alex.klimchuk.javacore.consoleshop.helper.impl.SumOfTopFiveProductsHelperImpl;
import alex.klimchuk.javacore.consoleshop.model.*;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static alex.klimchuk.javacore.consoleshop.helper.CatalogInitializingHelper.*;

@RunWith(MockitoJUnitRunner.class)
public class TestSumOfTopFiveProductsHelperImpl {

    private final SumOfTopFiveProductsHelper SUM_OF_TOP_FIVE_PRODUCTS_HELPER = new SumOfTopFiveProductsHelperImpl();
    private Catalog catalog;

    @Before
    public void setUp() {
        catalog = CatalogInitializingHelper.initializeCatalog();
    }

    @Test
    public void testSumOfTopFiveProductsPricesInCategory() {
        getExpectedSumsToCategoryMap().forEach((category, expectedSumForCategory) -> {
                    BigDecimal actualSumForCategory = SUM_OF_TOP_FIVE_PRODUCTS_HELPER.sumOfTopFiveProductsPrices(category);
                    Assert.assertEquals(actualSumForCategory, expectedSumForCategory);
                }
        );
    }

    private Map<Category, BigDecimal> getExpectedSumsToCategoryMap() {
        Map<Category, BigDecimal> expectedSumsToCategoryMap = new HashMap<>();
        expectedSumsToCategoryMap.put(getCategoryByName(LAPTOP_CATEGORY_NAME), EXPECTED_SUM_IN_LAPTOP);
        expectedSumsToCategoryMap.put(getCategoryByName(TABLET_CATEGORY_NAME), EXPECTED_SUM_IN_TABLET);
        expectedSumsToCategoryMap.put(getCategoryByName(SMARTPHONE_CATEGORY_NAME), EXPECTED_SUM_IN_SMARTPHONE);
        return expectedSumsToCategoryMap;
    }

    private Category getCategoryByName(String categoryName) {
        return catalog.getCategories()
                .stream()
                .filter(category -> category.getName().equals(categoryName))
                .findFirst()
                .get();
    }

}