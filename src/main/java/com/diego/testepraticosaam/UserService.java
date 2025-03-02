/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.testepraticosaam;

import com.diego.database.ConnectionDataBase;
import com.diego.entity.Users;
import com.diego.util.EncryptionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class UserService {
    
    public String createEmployee(Users user) {
        String sql = "INSERT INTO public.users (email, name, password) VALUES (?, ?, ?)";
        try {
            Connection connection = new ConnectionDataBase().getConexao();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, user.getEmail());
            stmt.setString(2, user.getName());
            stmt.setString(3, user.getPassword());
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                return "Created";
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o usuário: " + e.getMessage());
        }
        return "Error";
    }
    
    public Users validateLogin(String email, String password) {
        String sql = "SELECT * FROM public.users WHERE email = ? AND password = ?";
        try {
            Connection connection = new ConnectionDataBase().getConexao();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, EncryptionUtil.hashPassword(password));
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Users(rs.getString("name"), rs.getString("email"), null);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao validar login: " + e.getMessage());
        }
        return null;
    }
    
}
