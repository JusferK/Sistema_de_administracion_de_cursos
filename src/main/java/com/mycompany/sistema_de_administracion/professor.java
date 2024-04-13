package com.mycompany.sistema_de_administracion;
public class professor extends administrator {
    
    private String name;
    public String lastName;

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public professor(String name, String lastName, String user, String password) {
        super(user, password);
        this.name = name;
        this.lastName = lastName;
    }
    
    public static boolean professorLogin(String userField, String passwordField) {
        boolean found = false;
        for (professor p : Sistema_De_Administracion.professorsList) {
            if (p.user.equals(userField) && p.password.equals(passwordField)) {
                found = true;
                break;
            } else {
                found = false;
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
