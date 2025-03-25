/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class DBConnection {

    private static final String URL = "jdbc:oracle:thin:@localhost:1522:xe";
    private static final String USERNAME = "system";
    private static final String PASSWORD = "netr";
    private static Connection connection = null;

    // Open database connection
    public static Connection openDBConnection() {
        try {
            if (connection == null || connection.isClosed()) {  // Prevent using closed connection
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    // Close database connection
    public static void closeDBConnection() {
        if (connection != null) {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Failed to close the database connection.");
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        openDBConnection();

        closeDBConnection();
    }
}
