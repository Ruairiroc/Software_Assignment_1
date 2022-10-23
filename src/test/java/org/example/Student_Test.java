package org.example;

import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Student_Test {

    public Student student;

    @Test
    void testClass() {
        student = new Student("Brian", 21, new Date(26/02/2001), 19310759);
    }

    @Test
    public void testGetName()
    {
        String result = student.getName();
        String expected = "Brian";
        assertEquals(expected, result);
    }

    @Test
    public void testGetAge()
    {
        int result = student.getAge();
        int expected = 21;
        assertEquals(expected, result);
    }

    @Test
    public void testGetDob()
    {
        Date result = student.getDob();
        Date expected = new Date(26/02/2001);
        assertEquals(expected, result);
    }

    @Test
    public void testGetID()
    {
        int result = student.getID();
        int expected = 19310759;
        assertEquals(expected, result);
    }

    @Test
    public void testGetUsername()
    {
        String result = student.getUsername();
        String expected = "Brian21";
        assertEquals(expected, result);
    }
}
