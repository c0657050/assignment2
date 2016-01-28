/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Toshif Sheikh
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);
       }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Student instance = new Student();
        instance.setName(name);
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Student instance = new Student();
        String expResult = null;
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Student instance = new Student();
        instance.setId(id);
    }

    /**
     * Test of getGender method, of class Student.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Student instance = new Student();
        String expResult = null;
        String result = instance.getGender();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGender method, of class Student.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "";
        Student instance = new Student();
        instance.setGender(gender);
    }

    /**
     * Test of getGrade method, of class Student.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        Student instance = new Student();
        Double expResult = null;
        Double result = instance.getGrade();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGrade method, of class Student.
     */
    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        Double grade = null;
        Student instance = new Student();
        instance.setGrade(grade);
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student();
        String expResult = "{\"name\":\"" + instance.getName()+ "\",\"id\":\""+instance.getId()+ "\",\"gender\":\""+ instance.getGender()+"\",\"grade\":"+instance.getGrade() + "}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEqual() {
        System.out.println("testEqual");
        Object sub = new Object();
        Student stu = null;
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.equals(sub);
        assertEquals(expResult, result);
    }
    @Test
    public void testgetName(){
        System.out.println("testcons");
        Student instance = new Student("Sahil","c0657966","M",10.00);
        String expResult = "Sahil";
        String result = instance.getName();
        assertEquals(expResult, result);
}
     @Test
    public void testgetId(){
        System.out.println("testgetId");
        Student instance = new Student("Sahil","c0657966","M",10.00);
        String expResult = "c0657966";
        String result = instance.getId();
        assertEquals(expResult, result);
}   
    
         @Test
    public void testgetGender(){
        System.out.println("testgetGender");
        Student instance = new Student("Sahil","c0657966","M",10.00);
        String expResult = "M";
        String result = instance.getGender();
        assertEquals(expResult, result);
}   
    
         @Test
    public void testgetGrade(){
        System.out.println("testgetGrade");
        Student instance = new Student("Sahil","c0657966","M",10.00);
        Double expResult = 10.00;
        Double result = instance.getGrade();
        assertEquals(expResult, result);
}
    
    @Test
    public void StudentObjectWithTheSameNameAndId() {
        System.out.println("StudentObjectWithTheSameNameAndId");
        Student stu = null;
        Student instance = new Student("Toshif","c0657050","M",10.0);
        Student instance2 = new Student("Toshif","c0657050","M",10.0);
        boolean expResult = true;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
    }
        @Test
    public void testStudentObjectWithTheSameNameButADifferentId() {
        System.out.println("testStudentObjectWithTheSameNameButADifferentId");
        Student stu = null;
        Student instance = new Student("Toshif","c0657050","IPRC",10.0);
        Student instance2 = new Student("Sahil","c0657050","IPRC",10.0);
        boolean expResult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
    }
            @Test
    public void testStudentObjectWithTheSameIdButADiffferentName() {
        System.out.println("testStudentObjectWithTheSameIdButADiffferentName");
        Student stu = null;
        Student instance = new Student("Toshif","c0657050","IPRC",10.0);
        Student instance2 = new Student("Sahil","c0657050","IPRC",10.0);
        boolean expResult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
    }
        @Test
    public void testStudentObjectWithBothADifferentIdAndADifferentName() {
        System.out.println("testStudentObjectWithBothADifferentIdAndADifferentName");
        Student stu = null;
        Student instance = new Student("Toshif","c0657050","IPRC",10.0);
        Student instance2 = new Student("Sahil","c0657050","IPRC",10.0);
        boolean expResult = false;
        boolean result = instance.equals(instance2);
        assertEquals(expResult, result);
    }
}

