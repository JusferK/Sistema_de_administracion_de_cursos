package com.mycompany.sistema_de_administracion;

import java.io.Serializable;
import javax.swing.JFrame;

public class administrator implements Serializable {
    
    public String user;
    public String password;
    private String adminName;
    
    public administrator(String user, String password) {
        this.user = user;
        this.password = password;
    }
    
    public administrator(String user, String password, String adminName) {
        this(user, password);
        this.adminName = adminName;
    }
    
    public administrator() {
        
    }
    
    public administrator(String password) {
        this.password = password;
    }
    
    public String getAdminName() {
        return adminName;
    }
    
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
    
    public boolean login(String userField, String passwordField) {
        return this.user.equals(userField) && this.password.equals(passwordField);
    }
    
    public static void logout(JFrame currentScreen) {
        currentScreen.dispose();
        Login newLogin = new Login();
        newLogin.setVisible(true);
        newLogin.setResizable(false);
    }
}
