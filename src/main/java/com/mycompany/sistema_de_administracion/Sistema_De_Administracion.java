package com.mycompany.sistema_de_administracion;
import java.util.ArrayList;

public class Sistema_De_Administracion {
    
public static administrator mainAdmin = new administrator("ADMIN", "ADMIN", "Justine");

public static ArrayList<professor> professorsList = new ArrayList<>();
public static ArrayList<student> studentList = new ArrayList<>();
public static ArrayList<Class> classList = new ArrayList<>();
 
    public static void main(String[] args) {
        
        professor newProfessor = new professor("Lilia", "Altan", "lilalt", "micontra52");
        professor newProfessor2 = new professor("Chrysta", "Aguilar", "chragu18", "FerChrys1920!");
        professor newProfessor3 = new professor("Yuvisa", "Perez", "yuvper85", "Lapradera2024!");
        professor newProfessor4 = new professor("Luis", "Garcia", "luigar2023", "Miumg2023!");
        professor newProfessor5 = new professor("Carlos", "Davila", "cardav99", "Micontra2024!");
        
        
        student newStudent = new student("Lester", "Veliz", "lesvez", "mypassword");
        student newStudent2 = new student("Anika", "Arriaga", "aniarr12", "Betania2024!");
        student newStudent3 = new student("Jania", "Pol", "janpol03", "Galileo2024!");
        student newStudent4 = new student("Marlon", "Chavez", "marcha02", "Is4tech!");
        student newStudent5 = new student("Nombre1", "Apellido1", "Usuario1920!", "password2024!");
        student newStudent6 = new student("Nombre2", "Apellido2", "Usuario21920!", "password22024!");
        student newStudent7 = new student("Nombre3", "Apellido3", "Usuario31920!", "password32024!");
        student newStudent8 = new student("Nombre4", "Apellido4", "Usuario41920!", "password42024!");
        student newStudent9 = new student("Nombre5", "Apellido5", "Usuario51920!", "password52024!");
        student newStudent10 = new student("Nombre6", "Apellido6", "Usuario61920!", "password62024!");
        student newStudent11 = new student("Nombre7", "Apellido7", "Usuario71920!", "password72024!");
        
        Class newClass = new Class("1", "Proceso administrativo", "A", "Yuvisa Perez", "01/02/2024", "31/06/2024", "AM", "AM", 7, 9);
        Class newClass2 = new Class("2", "Derecho informativo", "A", "Lilia Altan", "01/02/2024", "31/06/2024", "AM", "AM", 9, 11);
        Class newClass3 = new Class("3", "Calculo I", "A", "Chrysta Aguilar", "01/02/2024", "31/06/2024", "AM", "PM", 11, 1);
        Class newClass4 = new Class("4", "Fisica I", "A", "Luis Garcia", "01/02/2024", "31/06/2024", "PM", "PM", 2, 4);
        Class newClass5 = new Class("5", "Programacion I", "A", "Carlos Davila", "01/02/2024", "31/06/2024", "PM", "PM", 4, 6);
        
        
        Login generalLogin = new Login();
        generalLogin.setVisible(true);
        generalLogin.setResizable(false);
        
        professorsList.add(newProfessor);
        professorsList.add(newProfessor2);
        professorsList.add(newProfessor3);
        professorsList.add(newProfessor4);
        professorsList.add(newProfessor5);
        
        
        studentList.add(newStudent);
        studentList.add(newStudent2);
        studentList.add(newStudent3);
        studentList.add(newStudent4);
        studentList.add(newStudent5);
        studentList.add(newStudent6);
        studentList.add(newStudent7);
        studentList.add(newStudent8);
        studentList.add(newStudent9);
        studentList.add(newStudent10);
        studentList.add(newStudent11);
        
        classList.add(newClass);
        classList.add(newClass2);
        classList.add(newClass3);
        classList.add(newClass4);
        classList.add(newClass5);
    }
}
