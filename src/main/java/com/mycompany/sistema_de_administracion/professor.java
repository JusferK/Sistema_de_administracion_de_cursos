package com.mycompany.sistema_de_administracion;
public class professor extends administrator {
    
    public static String name;
    public static String lastName;

    public professor(String name, String lastName, String user, String password) { // constructor para crear una instancia
        super(user, password);
        this.name = name;
        this.lastName = lastName;
    }
    
    public static boolean professorLogin(String userField, String passwordField) {
        boolean found = false;
        for (professor p : Sistema_De_Administracion.professorsList) {
            if (p.user.equals(userField) && p.password.equals(passwordField)) {
                found = true;
            } else {
                found = false;
            }
        }
        return found;
    }
}
