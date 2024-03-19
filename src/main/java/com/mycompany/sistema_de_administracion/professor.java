package com.mycompany.sistema_de_administracion;
public class professor extends administrator {
    
    public String name;
    public String lastName;

    public professor(String name, String lastName, String user, String password) { // constructor para crear una instancia
        super(user, password);
        this.name = name;
        this.lastName = lastName;
    }
}
