package alex.klimchuk.javacore.consoleshop.repository;

import java.sql.SQLException;
import java.sql.Connection;

/**
 * Copyright Alex Klimchuk (c) 31.10.2019.
 */
@FunctionalInterface
public interface TransactionStrategy {

    void executeTransaction(Connection connection) throws SQLException;

}