package com.mycompany.sistema_de_administracion;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class mi_serializacion {
    
    public static <T> void writeObject(ArrayList<T> list, String filePath) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static <T> ArrayList<T> readObject(String filename) {
        ArrayList<T> tempList = null;
        
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            tempList = (ArrayList<T>) in.readObject();
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return tempList;
    }
    
}
