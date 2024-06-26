package com.mycompany.sistema_de_administracion;

import java.io.Serializable;

public class professor extends administrator implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String name;
    public String lastName;
    public String speciallity;
    public String sex;

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public professor(String name, String lastName, String user, String password, String speciallity, String sex) {
        super(user, password);
        this.name = name;
        this.lastName = lastName;
        this.speciallity = speciallity;
        this.sex = sex;
    }
    
    public professor() {
        
    }
    
    public static boolean professorLogin(String userField, String passwordField) {
        boolean found = false;
        if (!Sistema_De_Administracion.professorsList.isEmpty()) {
            for (professor p : Sistema_De_Administracion.professorsList) {
                if (p.user.equals(userField) && p.password.equals(passwordField)) {
                    found = true;
                    break;
                } else {
                    found = false;
                }
            }
        }
        return found;
    }
    
    public static String professorWelcomeName(String user) {
        String lookingForName = null;
        for(professor p : Sistema_De_Administracion.professorsList) {
            if (p.user.equals(user)) {
               lookingForName = p.getName(); 
            }
        }
        
        return lookingForName;
    }
    
    public static String professorLastName(String user, String name) {
        String lookingForLastName = null;
        for(professor p : Sistema_De_Administracion.professorsList) {
            if (p.user.equals(user) && p.name.equals(name)) {
               lookingForLastName = p.lastName; 
            }
        }
        
        return lookingForLastName;
    }
}
