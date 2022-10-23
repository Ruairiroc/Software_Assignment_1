package org.example;

import java.util.Date;
import java.util.*;

public class Student {
    public String name;
    public int age;
    public Date dob;
    public int ID;
    public Course course;
    public List<Module> modules = new ArrayList<>();

    public Student(String name, int age, Date dob, int ID){
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

    public void setModules()
    {
        this.modules = modules;
    }

    public void setCourse()
    {
        this.course = course;
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

    public Course getCourse()
    {
        return course;
    }

    public List<Module> getModules()
    {
        return modules;
    }
}