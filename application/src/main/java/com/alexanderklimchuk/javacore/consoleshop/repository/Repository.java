package com.alexanderklimchuk.javacore.consoleshop.repository;

import com.alexanderklimchuk.javacore.consoleshop.exception.RepositoryException;
import com.alexanderklimchuk.javacore.consoleshop.connection.ConnectionManager;
import com.alexanderklimchuk.javacore.consoleshop.model.BaseEntity;

import java.sql.SQLException;
import java.sql.Connection;

public abstract class Repository<T extends BaseEntity> {

    public void doInNewTransaction(TransactionStrategy transactionStrategy) {
        try (Connection connection = ConnectionManager.getConnection()) {
            try {
                transactionStrategy.executeTransaction(connection);
                connection.commit();
            } catch (Exception ex) {
                try {
                    connection.rollback();
                } catch (SQLException e) {
                    System.out.println("Rollback failed! " + e.getMessage());
                }
                throw ex;
            }
        } catch (Exception ex) {
            if (ex instanceof RepositoryException) {
                throw (RepositoryException) ex;
            }
            throw new RepositoryException("Problems saving data or connecting to the database! ", ex);
        }
    }

}