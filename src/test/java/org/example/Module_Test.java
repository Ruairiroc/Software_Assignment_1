package org.example;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Module_Test {
    public Module module;
    public Lecturer lecturer;

    @Test
    void testClass() {
        module = new Module("Software Engineering", "CT-215");
        lecturer = new Lecturer("Sally", 32, new Date(9/11/1990), 17631428);
    }

    @Test
    public void testGetName()
    {
        String result = module.getName();
        String expected = "Software Engineering";
        assertEquals(expected, result);
    }

    @Test
    public void testGetID()
    {
        String result = module.getID();
        String expected = "CT-215";
        assertEquals(expected, result);
    }

    @Test
    public void testGetLecturer()
    {
        Lecturer result = module.getLecturer();
        Lecturer expected = lecturer;
        assertEquals(expected, result);
    }

    @Test
    public void testSetCourseAssociated()
    {
        List<String> courseAssociated = null;
    }
}
