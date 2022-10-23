package org.example;

import java.util.ArrayList;
import java.util.List;

public class Module {
    public String name;
    public String ID;
    public List <Student> students = new ArrayList<Student>();
    public Lecturer lecturer;
    public List<Course> courseAssociated = new ArrayList<>();

    public Module(String name, String ID)
    {
        this.name = name;
        this.ID = ID;
    }

    public void setCourseAssociated(List<Course> courseAssociated) {
        this.courseAssociated = courseAssociated;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public String getName()
    {
        return name;
    }

    public String getID()
    {
        return ID;
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public Lecturer getLecturer()
    {
        return lecturer;
    }

    public List<Course> getCourseAssociated()
    {
        return courseAssociated;
    }
}