package org.example;

import java.util.Date;
import java.util.List;
import org.joda.time.DateTime;


import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Course_Test {
    public Course course;
    public Module module;
    public Student student;

    @Test
    void testClass() {
        course = new Course("Computer Science", new DateTime(2022,9,4,0,0,0,0), new DateTime(2023,5,25,0,0,0,0));
        module = new Module("Machine Learning", "CT-316");
        student= new Student("Darren", 20, new Date(4/12/2002), 19421569);
    }

    @Test
    public void testGetName()
    {
        String result = course.getName();
        String expected = "Computer Science";
        assertEquals(expected, result);
    }

    @Test
    public void testGetStartDate()
    {
        DateTime result = course.getStartDate();
        DateTime expected = new DateTime(2022,9,4,0,0,0,0);
        assertEquals(expected, result);
    }

    @Test
    public void testGetEndDate()
    {
        DateTime result = course.getEndDate();
        DateTime expected = new DateTime(2023,5,25,0,0,0,0);
        assertEquals(expected, result);
    }

    @Test
    public void testSetStudents() {
        List<String> students = null;
        course.setStudents((List<Student>) student);
    }

    @Test
    public void testSetModules() {
        course.setModules((List<Module>) module);
    }
}
