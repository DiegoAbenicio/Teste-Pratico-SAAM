package com.diego.testepraticosaam.model;

import com.diego.testepraticosaam.model.Users;

/**
 *
 * @author diego
 */
public class AuthenticatedUser {
    private static Users usuario; 
    
    public static void setUsuario(Users user) {
        usuario = user;
    }

    public static Users getUsuario() {
        return usuario;
    }

    public static void logout() {
        usuario = null;
    }

    public static boolean isLoggedIn() {
        return usuario != null;
    }
}
    
