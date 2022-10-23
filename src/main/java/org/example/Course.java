package org.example;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

public class Course {
    public String name;
    public List<Module> modules = new ArrayList<Module>();
    public List<Student> students = new ArrayList<Student>();

    public DateTime startDate;
    public DateTime endDate;


    public Course(String name, DateTime startDate, DateTime endDate)
    {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public String getName()
    {
        return name;
    }

    public List<Module> getModules()
    {
        return modules;
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public DateTime getStartDate()
    {
        return startDate;
    }

    public DateTime getEndDate()
    {
        return endDate;
    }


}