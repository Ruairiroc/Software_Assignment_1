package org.example;

import java.util.Date;
import java.util.*;

public class Lecturer{
    public String name;
    public int age;
    public Date dob;
    public int ID;
    public List <Module> modules;

    public Lecturer(String name, int age, Date dob, int ID){
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.dob = dob;
    }

    public String getUsername() {
        String num = String.valueOf(age);
        String username = name.concat(num);
        System.out.println("Username: "+username);
        return username;
    }

    public void setModules(List<Module> modules)
    {
        this.modules = modules;
    }
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public Date getDob()
    {
        return dob;
    }

    public int getID()
    {
        return ID;
    }

    public List<Module> getModules()
    {
        return modules;
    }
}