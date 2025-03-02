package com.diego.testepraticosaam.controller;

import com.diego.testepraticosaam.model.AuthenticatedUser;
import com.diego.testepraticosaam.model.Users;
import com.diego.testepraticosaam.service.UserService;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class UserController {
    
    public boolean createUser(Users users){
        UserService userService = new UserService();
        String result = userService.createEmployee(users);
        if(result.trim().equals("Created")){
            JOptionPane.showMessageDialog(null, "Cadastro feito com Sucesso!");
            return true;        
        }
        JOptionPane.showMessageDialog(null, "Erro ao criar o cadastro, por favor tente mais tarde!");
        return  false;
    }
    
    public boolean login(String email, String password){
        UserService userService = new UserService();
        Users user = userService.validateLogin(email, password);
        if(Objects.nonNull(user)){
            AuthenticatedUser.setUsuario(user);
            return true;
        }  
        JOptionPane.showMessageDialog(null, "Senha incorreta!");
        return false;
    }
    
    public boolean unavailableEmail(String email){
        UserService userService = new UserService();
        return userService.unavailableEmail(email);
    }
}
