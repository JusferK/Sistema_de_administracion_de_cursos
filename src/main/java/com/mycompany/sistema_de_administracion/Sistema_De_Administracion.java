package com.mycompany.sistema_de_administracion;
import java.util.ArrayList;

public class Sistema_De_Administracion {
    
public static administrator mainAdmin = new administrator("ADMIN", "ADMIN", "Justine");

public static ArrayList<professor> professorsList = new ArrayList<>();
public static ArrayList<student> studentList = new ArrayList<>();
public static ArrayList<Class> classList = new ArrayList<>();
 
    public static void main(String[] args) {
        Login generalLogin = new Login();
        generalLogin.setVisible(true);
        generalLogin.setResizable(false);
    }
}
