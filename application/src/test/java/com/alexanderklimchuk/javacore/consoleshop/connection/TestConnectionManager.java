package com.alexanderklimchuk.javacore.consoleshop.connection;

import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;
import java.sql.Connection;

@RunWith(MockitoJUnitRunner.class)
public class TestConnectionManager {

    @Test
    public void checkConnection() throws SQLException {
        try (Connection connection = ConnectionManager.getConnection()) {
            Assert.assertNotNull(connection);
        }
    }

}