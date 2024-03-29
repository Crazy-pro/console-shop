package alex.klimchuk.javacore.consoleshop.repository;

import alex.klimchuk.javacore.consoleshop.helper.CatalogInitializingHelper;
import alex.klimchuk.javacore.consoleshop.model.Category;
import alex.klimchuk.javacore.consoleshop.exception.RepositoryException;
import alex.klimchuk.javacore.consoleshop.connection.ConnectionManager;
import alex.klimchuk.javacore.consoleshop.repository.impl.CategoryRepositoryImpl;
import org.junit.*;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;


@Ignore
@RunWith(MockitoJUnitRunner.class)
public class CategoryRepositoryImplTest {

    private static final String CATEGORY_NAME = "Category for tests";
    private static final String DELETE_ALL_CATEGORIES_SQL = "DELETE FROM categories;";
    private static final String DELETE_ALL_PRODUCTS_SQL = "DELETE FROM products;";
    private CategoryRepository categoryRepository;

    @Before
    public void setUp() {
        categoryRepository = new CategoryRepositoryImpl();
        clearDatabase();
        fillDatabase();
    }

    @After
    public void cleanUp() {
        clearDatabase();
    }

    @Test
    public void testFindAll() {
        Assert.assertEquals(getExpectedCategories(), categoryRepository.findAll());
    }

    @Test
    public void testSaving() {
        Category category = new Category(CATEGORY_NAME);
        categoryRepository.save(category);
        Assert.assertTrue(checkCategoryExistenceByName(CATEGORY_NAME));
    }

    private boolean checkCategoryExistenceByName(String categoryName) {
        return categoryRepository.findAll()
                .stream()
                .map(Category::getName)
                .anyMatch(name -> name.equals(categoryName));
    }

    private List<Category> getExpectedCategories() {
        return CatalogInitializingHelper.initializeCatalog().getCategories();
    }

    private void fillDatabase() {
        for (Category category : getExpectedCategories()) {
            categoryRepository.save(category);
        }
    }

    private void clearDatabase() {
        try (Connection connection = ConnectionManager.getConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(DELETE_ALL_CATEGORIES_SQL);
            statement.executeUpdate(DELETE_ALL_PRODUCTS_SQL);
            connection.commit();
        } catch (SQLException ex) {
            throw new RepositoryException("The database hasn't been cleaned! ", ex);
        }
    }

}
