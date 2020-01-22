package com.alexanderklimchuk.javacore.consoleshop.connection;

import static com.alexanderklimchuk.javacore.consoleshop.settings.DataBaseConnectionSettings.*;

import com.alexanderklimchuk.javacore.consoleshop.exception.ConnectionException;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionManager {

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            connection.setAutoCommit(false);
            return connection;
        } catch (SQLException ex) {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Connection don't closed! ");
                }
            }
            throw new ConnectionException("Problem with connection to database. Check connection data! ", ex);
        }
    }

}