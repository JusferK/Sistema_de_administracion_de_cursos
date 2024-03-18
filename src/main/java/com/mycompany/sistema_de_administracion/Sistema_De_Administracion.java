package com.mycompany.sistema_de_administracion;
import java.util.ArrayList;

public class Sistema_De_Administracion {
public static ArrayList<administrator> Administrators = new ArrayList<>();

    public static void main(String[] args) {
        Login generalLogin = new Login();
        generalLogin.setVisible(true);
        generalLogin.setResizable(false);
        
        administrator mainAdmin = new administrator();
        mainAdmin.user = "ADMIN";
        mainAdmin.password = "ADMIN";
        mainAdmin.adminName = "Justine";
    }
}
