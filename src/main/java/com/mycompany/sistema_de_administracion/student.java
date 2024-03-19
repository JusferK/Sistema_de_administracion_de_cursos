package com.mycompany.sistema_de_administracion;
public class student extends administrator {
    
    private String studentID;
    private String studentName;
    private String studentLastName;
    
    public student(String studentName, String studentLastName, String studentID, String password) {
        super(password);
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.studentID = studentID;
    }
    
    public String getStudentName(String studentName) {
        return studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public String getStudentLastName(String studentLastName) {
        return studentLastName;
    }
    
    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }
    
    public String getStudentID() {
        return studentID;
    }
    
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    
    
    public boolean studentlogin(String studentIDField, String passwordField) {
        return this.studentID.equals(studentIDField) && this.password.equals(passwordField);
    }
    
}
