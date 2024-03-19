package com.mycompany.sistema_de_administracion;
public class administrator {
    
    public String user;
    public String password;
    private String adminName;
    
    public administrator(String user, String password) { // constructor que hereda professor
        this.user = user;
        this.password = password;
    }
    
    public administrator(String user, String password, String adminName) { // constructor para crear una instancia de administrator
        this(user, password);
        this.adminName = adminName;
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
}
