package com.mycompany.sistema_de_administracion;
import java.util.ArrayList;

public class Sistema_De_Administracion {
    
public static administrator mainAdmin = new administrator("ADMIN", "ADMIN", "Justine");

public static ArrayList<professor> professorsList = new ArrayList<>();
public static ArrayList<student> studentList = new ArrayList<>();
public static ArrayList<Class> classList = new ArrayList<>();

static String professorPath = "/home/justine/Documents/registros_professor.ser";
static String studentPath = "/home/justine/Documents/registros_student.ser";
static String classPath = "/home/justine/Documents/registros_class.ser";
static String threeCharListPath = "/home/justine/Documents/registros_char_list.ser";
 
    public static void main(String[] args) {
        
        professorsList = mi_serializacion.readObject(professorPath);
        if (professorsList == null) professorsList = new ArrayList<>();
        
        studentList = mi_serializacion.readObject(studentPath);
        if (studentList == null) studentList = new ArrayList<>();
        
        
        classList = mi_serializacion.readObject(classPath);
        if (classList == null) classList = new ArrayList<>();
        
        adminPanels.createCoursePanel.threeCharList = mi_serializacion.readObject(threeCharListPath);
        if (adminPanels.createCoursePanel.threeCharList == null) adminPanels.createCoursePanel.threeCharList = new ArrayList<>(); 
        
        Login generalLogin = new Login();
        generalLogin.setVisible(true);
        generalLogin.setResizable(false);
        
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            mi_serializacion.writeObject(professorsList, professorPath);
            mi_serializacion.writeObject(studentList, studentPath);
            mi_serializacion.writeObject(classList, classPath);
            mi_serializacion.writeObject(adminPanels.createCoursePanel.threeCharList, threeCharListPath);
        }));
    }
}
