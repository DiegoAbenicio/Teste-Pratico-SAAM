/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.testepraticosaam;

import com.diego.database.ConnectionDataBase;
import com.diego.entity.Employees;
import java.math.BigDecimal;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class EmployeesService {
    
    public String createEmployee(Employees employee) {
        String sql = "INSERT INTO public.employees (name, status, remuneration, admission_date) VALUES (?, ?, ?, ?)";
        try (Connection connection = new ConnectionDataBase().getConexao();
            PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, employee.getName());
            stmt.setBoolean(2, employee.getStatus());
            stmt.setBigDecimal(3, employee.getRemuneration());
            stmt.setDate(4, new java.sql.Date(employee.getAdmissionDate().getTime()));
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                return "Created";
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir funcionário: " + e.getMessage());
        }
        return "Error";
    }
    
    public List<Employees> getEmployeesWithPagination(int page, int pageSize) {
        List<Employees> employees = new ArrayList<>();
        String sql = "SELECT * FROM public.employees ORDER BY admission_date LIMIT ? OFFSET ?";
        try {
            Connection connection = new ConnectionDataBase().getConexao();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pageSize);
            stmt.setInt(2, (page - 1) * pageSize);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                boolean status = rs.getBoolean("status");
                BigDecimal remuneration = rs.getBigDecimal("remuneration");
                Date admissionDate = rs.getDate("admission_date");
                Integer id = rs.getInt("id");
                Employees employee = new Employees(name, status, remuneration, admissionDate);
                employee.setId(id);
                employees.add(employee);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar funcionários: " + e.getMessage());
        }
        return employees;
    }
    
    public int getTotalEmployeesCount() {
        String sql = "SELECT COUNT(*) FROM public.employees";
        try{
            Connection connection = new ConnectionDataBase().getConexao();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return (int) Math.ceil((double) rs.getInt(1) / 10);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao contar funcionários: " + e.getMessage());
        }
        return 0;
    }
    
    public String deleteEmployee(int id) {
        String sql = "DELETE FROM public.employees WHERE id = ?";
        try{
            Connection connection = new ConnectionDataBase().getConexao();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                return "Funcionário excluído com sucesso!";
            } else {
                return "Funcionário não encontrado!";
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir funcionário: " + e.getMessage());
            return "Erro ao excluir funcionário!";
        }
    }
    
    public Employees findById(int id) {
        String sql = "SELECT * FROM public.employees WHERE id = ?";
        Employees employee = null;
        try {
            Connection connection = new ConnectionDataBase().getConexao();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String name = rs.getString("name");
                boolean status = rs.getBoolean("status");
                BigDecimal remuneration = rs.getBigDecimal("remuneration");
                Date admissionDate = rs.getDate("admission_date");
                employee = new Employees(name, status, remuneration, admissionDate);
                employee.setId(id);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar funcionário: " + e.getMessage());
        }
        return employee;
    }
    
    public String updateEmployee(Employees employee) {
        String sql = "UPDATE public.employees SET name = ?, status = ?, remuneration = ?, admission_date = ? WHERE id = ?";
        try {
            Connection connection = new ConnectionDataBase().getConexao();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, employee.getName());
            stmt.setBoolean(2, employee.getStatus());
            stmt.setBigDecimal(3, employee.getRemuneration());
            stmt.setDate(4, new java.sql.Date(employee.getAdmissionDate().getTime()));
            stmt.setInt(5, employee.getId());
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                return "Updated";
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar funcionário: " + e.getMessage());
        }
        return "Error";
    }


    
}
