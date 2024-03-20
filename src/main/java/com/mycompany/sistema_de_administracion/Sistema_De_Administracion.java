package com.mycompany.sistema_de_administracion;
import java.util.ArrayList;

public class Sistema_De_Administracion {
    
// instancias de clases solo test...
public static administrator mainAdmin = new administrator("ADMIN", "ADMIN", "Justine");

public static ArrayList<professor> professorsList = new ArrayList<>();
public static ArrayList<student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        professor newProfessor = new professor("Lilia", "Altan", "lilalt", "micontra52");
        student newStudent = new student("Lester", "David", "lesdav", "mypassword");
        
        Login generalLogin = new Login();
        generalLogin.setVisible(true);
        generalLogin.setResizable(false);
        
        professorsList.add(newProfessor);
        studentList.add(newStudent);
    }
}
