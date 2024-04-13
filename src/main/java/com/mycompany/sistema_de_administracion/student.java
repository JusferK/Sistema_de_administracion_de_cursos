package com.mycompany.sistema_de_administracion;
import java.util.ArrayList;
public class student extends administrator {
    
    private String studentID;
    private String studentName;
    private String studentLastName;
    public ArrayList<Class> coursesAssigned = new ArrayList<>();
    
    public student(String studentName, String studentLastName, String studentID, String password) {
        super(password);
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.studentID = studentID;
    }
    
    public String getStudentName() {
        return this.studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public String getStudentLastName() {
        return this.studentLastName;
    }
    
    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }
    
    public String getStudentID() {
        return this.studentID;
    }
    
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    
    
    public static boolean studentLogin(String studentID, String passwordField) {
        boolean found = false;
        for (student s : Sistema_De_Administracion.studentList) {
            if (s.getStudentID().equals(studentID) && s.password.equals(passwordField)) {
                found = true;
                break;
            } else {
                found = false;
            }
        }
        return found;
    }
    
    public static String studentWelcomeName(String user) {
        String lookingForName = null;
        for(student s : Sistema_De_Administracion.studentList) {
            if (s.getStudentID().equals(user)) {
               lookingForName = s.studentName; 
            }
        }
        return lookingForName;
    }
    
    public static student retreiveInfo(String name, String studentID) {
        
        student studentReturn = null;
        
        for (student sT : com.mycompany.sistema_de_administracion.Sistema_De_Administracion.studentList) {
            if (name.equals(sT.getStudentName()) && studentID.equals(sT.getStudentID())) {
                studentReturn = sT;
            }
        }
        
        return studentReturn;
    }
}
