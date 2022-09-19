package alex.klimchuk.javacore.consoleshop.repository;

import alex.klimchuk.javacore.consoleshop.model.BaseEntity;
import alex.klimchuk.javacore.consoleshop.exception.RepositoryException;
import alex.klimchuk.javacore.consoleshop.connection.ConnectionManager;

import java.sql.SQLException;
import java.sql.Connection;

/**
 * Copyright Alex Klimchuk (c) 31.10.2019.
 */
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