package org.example;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Lecturer_Test {

    public Lecturer lecturer;
    public Module m;

    @Test
    void testClass() {
        lecturer = new Lecturer("Sammy", 60, new Date(18/04/1962), 18937450);
        m = new Module("Database Systems", "847920");
    }

    @Test
    public void testGetName()
    {
        String result = lecturer.getName();
        String expected = "Sammy";
        assertEquals(expected, result);
    }

    @Test
    public void testGetAge()
    {
        int result = lecturer.getAge();
        int expected = 60;
        assertEquals(expected, result);
    }

    @Test
    public void testGetDob()
    {
        Date result = lecturer.getDob();
        Date expected = new Date(18/04/1962);
        assertEquals(expected, result);
    }

    @Test
    public void testGetID()
    {
        int result = lecturer.getID();
        int expected = 18937450;
        assertEquals(expected, result);
    }

    @Test
    public void testSetModules()
    {
        lecturer.setModules((List<Module>) m);
    }

    @Test
    public void testGetUsername()
    {
        String result = lecturer.getUsername();
        String expected = "Sammy60";
        assertEquals(expected, result);
    }
}
