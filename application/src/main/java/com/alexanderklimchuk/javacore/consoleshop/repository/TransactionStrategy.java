package com.alexanderklimchuk.javacore.consoleshop.repository;

import java.sql.SQLException;
import java.sql.Connection;

@FunctionalInterface
public interface TransactionStrategy {

    void executeTransaction(Connection connection) throws SQLException;

}