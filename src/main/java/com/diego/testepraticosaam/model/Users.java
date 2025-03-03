package com.diego.testepraticosaam.model;

import com.diego.testepraticosaam.util.EncryptionUtil;


/**
 *
 * @author diego
 */
public class Users {
    
    private Integer id;
    private String name;
    private String password;
    private String email;

    public Users(String name, String password, String email){
        setName(name);
        setPassword(password);
        setEmail(email);
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
       this.password = EncryptionUtil.hashPassword(password);
      
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
