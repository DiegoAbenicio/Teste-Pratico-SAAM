package com.diego.testepraticosaam.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author diego
 */
public class ConnectionDataBase {
    
     public Connection getConexao() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/teste-pratico-saam";
        String user = "postgres";
        String password = "root";

        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver do PostgreSQL não encontrado!", e);
        }
    } 
}
