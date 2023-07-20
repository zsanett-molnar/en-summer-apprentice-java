package com.practica.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {

    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public void getConnection() {
        String connectionUrl =
                "jdbc:sqlserver://DESKTOP-STNAJOC.net:1433;"
                        + "database=TicketManagementDB;"
                        + "loginTimeout=30;";

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            // Code here.
            System.out.println("OK");
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
