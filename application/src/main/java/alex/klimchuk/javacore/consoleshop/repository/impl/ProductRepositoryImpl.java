package alex.klimchuk.javacore.consoleshop.repository.impl;

import alex.klimchuk.javacore.consoleshop.model.Product;
import alex.klimchuk.javacore.consoleshop.repository.ProductRepository;
import alex.klimchuk.javacore.consoleshop.repository.Repository;

import java.sql.*;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

/**
 * Copyright Alex Klimchuk (c) 31.10.2019.
 */
public class ProductRepositoryImpl extends Repository<Product> implements ProductRepository {

    private static final String INSERT_PRODUCT_SQL = "INSERT INTO products " +
            "(name, description, price, manufacturer, category_id) VALUES (?, ?, ?, ?, ?);";

    @Override
    public void save(Product product) {
        doInNewTransaction(connection -> {
            try (PreparedStatement preparedStatement = connection.prepareStatement(
                    INSERT_PRODUCT_SQL,
                    RETURN_GENERATED_KEYS,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE)) {
                preparedStatement.setString(1, product.getName());
                preparedStatement.setString(2, product.getDescription());
                preparedStatement.setBigDecimal(3, product.getPrice());
                preparedStatement.setString(4, product.getManufacturer());
                preparedStatement.setLong(5, product.getCategoryId());
                preparedStatement.executeUpdate();
                try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        product.setId(generatedKeys.getLong(1));
                    }
                }
            }
        });
    }

}
