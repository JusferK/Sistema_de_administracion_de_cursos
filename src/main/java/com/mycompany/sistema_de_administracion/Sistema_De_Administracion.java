package com.mycompany.sistema_de_administracion;
//import java.util.ArrayList;

public class Sistema_De_Administracion {
static administrator mainAdmin = new administrator("ADMIN", "ADMIN", "Justine");
static professor newProfessor = new professor("Carlos", "Davila", "cardav", "pass123");
static student newStudent = new student("Marlon", "Chavez", "marchav2023", "micontra52");
    
    public static void main(String[] args) {
        Login generalLogin = new Login();
        generalLogin.setVisible(true);
        generalLogin.setResizable(false);
    }
}
