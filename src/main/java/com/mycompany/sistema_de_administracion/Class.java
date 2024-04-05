package com.mycompany.sistema_de_administracion;

import java.util.ArrayList;

public class Class {
    
    public String ID;
    public String courseName;
    public String section;
    public String professorAssigned;
    public String startDate;
    public String finishDate;
    public String startHourAmOrPm;
    public String finishHourAmOrPm;
    public int startHour;
    public int finishHour;
    public ArrayList<student> studentAssignedList = new ArrayList<>();
    
    public Class(String ID, String courseName, String section, String professorAssigned, String startDate, String finishDate, String startHourAmOrPm, String finishHourAmOrPm,  int startHour, int finishHour) {
        this.ID = ID;
        this.courseName = courseName;
        this.section = section;
        this.professorAssigned = professorAssigned;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.startHourAmOrPm = startHourAmOrPm;
        this.finishHourAmOrPm = finishHourAmOrPm;
        this.startHour = startHour;
        this.finishHour = finishHour;
    }
    
}
