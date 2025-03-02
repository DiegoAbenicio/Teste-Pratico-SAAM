package com.diego.testepraticosaam.controller;

import com.diego.testepraticosaam.model.Employees;
import com.diego.testepraticosaam.service.EmployeesService;
import java.awt.HeadlessException;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class EmployeesController {
    
    
    public boolean saveEmployees(Employees employees, Integer idEmployees){
        try{
                EmployeesService employessService = new EmployeesService();
                if(Objects.nonNull(idEmployees) && idEmployees != 0){
                    employees.setId(idEmployees);
                    String result = employessService.updateEmployee(employees);
                    if(result.trim().equals("Updated")){
                        JOptionPane.showMessageDialog(null, "Funcionário atualizado com sucesso!");
                        return true;
                    } 
                } else{
                    String result = employessService.createEmployee(employees);
                    if(result.trim().equals("Created")){
                        JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
                        return true;
                    } 
                }
            } catch (HeadlessException e){
                JOptionPane.showMessageDialog(null, "Erro ao salvar funcionário: " + e.getMessage());
            }
        return false;
    }
    
    public boolean deleteEmployees(Integer id){
        EmployeesService employeesService = new EmployeesService();
        String status = employeesService.deleteEmployee(id);
        if(status.trim().equals("Ok")){
            JOptionPane.showMessageDialog(null, "Excluído com sucesso");
            return true;
        }
        return false;
    }
    
    public List<Employees> listAllPagination(Integer page, Integer pageSize){
        EmployeesService employeesService = new EmployeesService();
        return employeesService.getEmployeesWithPagination(page, 10); 
    }
    
    public Employees findById(Integer id){
        EmployeesService employeesService = new EmployeesService();
        return employeesService.findById(id); 
    }
    
    
    public String returnTotalElements(){
        EmployeesService employeesService = new EmployeesService();
        return String.valueOf(employeesService.getTotalEmployeesCount()); 
    }
    
}
