package com.sistemalogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * classe para conexão com BD
 * @author Ronald
 */

public class ConexaoBancoDeDados {
    private static final String URL = "jdbc:sqlite:users.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}