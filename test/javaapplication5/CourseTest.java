/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0667381
 */
public class CourseTest {
    
    public CourseTest() {
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
     * Test of add method, of class Course.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Student student = null;
        Course instance = new Course();
        instance.add(student);
       
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_Student() {
        System.out.println("remove");
        Student student = null;
        Course instance = new Course();
        instance.remove(student);
       
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_String() {
        System.out.println("remove");
        String id = "";
        Course instance = new Course();
        instance.remove(id);
        
    }

    /**
     * Test of remove method, of class Course.
     */
 

    /**
     * Test of insert method, of class Course.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("sahil","c0657966","Male",80.3));
        Course instance = new Course (students);
        Student stu = new Student("Toshif","c0657050","Male",60.4);
        instance.insert(stu, 1);
        String expResult = "[" + instance.get(0).toString()+ ", " + instance.get(1).toString() + "]";
        String result = instance.getAll().toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class Course.
     */
   
    /**
     * Test of get method, of class Course.
     */
    @Test
    public void testGet_int() {
        System.out.println("get");
        int position = 0;
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("sahil","c0657966","Male",80.3));
        Course instance = new Course(students);
        String expResult = "{\"name\":\"sahil\",\"id\":\"c0657966\",\"gender\":\"Male\",\"grade\":80.3}";
        String result = instance.get(position).toString();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Course instance = new Course();
        List<Student> expResult = null;
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
       
    }
    @Test
     public void testGetAllShouldReturnList() {
        System.out.println("testGetAllShouldReturnList");
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("sahil","c0657966","Male",80.3));
        Course instance = new Course(students);
        String expResult = "[" + students.get(0).toString() + "]";
        String result = instance.getAll().toString();
        assertEquals(expResult, result);
       
    }
    
     @Test
     public void testGetAllWithZeroArgConstructWithAddingValueShouldReturnList() {
        System.out.println("testGetAllWithZeroArgConstructWithAddingValueShouldReturnList");
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("sahil","c0657966","Male",80.3));
        Course instance = new Course(students);
        String expResult = "[" + students.get(0).toString() + "]";
        String result = instance.getAll().toString();
        assertEquals(expResult, result);
       
    }
     
       @Test
     public void testGetAllWithRemoveShouldReturnList() {
        System.out.println("testGetAllWithRemoveShouldReturnList");
        Course instance = new Course();
        Student students = new Student("sahil","c0657966","Male",80.3);
        Student stu = new Student("Toshif","c0657050","Male",60.4);
        instance.add(students);
        instance.add(stu);
        instance.remove(1);
        String expResult = "[" + instance.get(0).toString() + "]";
        String result = instance.getAll().toString();
        assertEquals(expResult, result);
       
    }
       @Test
     public void testGetAllWithStringIdShouldReturnList() {
        System.out.println("testGetAllWithStringIdShouldReturnList");
        Course instance = new Course();
        Student students = new Student("sahil","c0657966","Male",80.3);
        Student stu = new Student("Toshif","c0657050","Male",60.4);
        instance.add(students);
        instance.add(stu);
        instance.remove("c0657966");
        String expResult = "[" + instance.get(0).toString() + "]";
        String result = instance.getAll().toString();
        assertEquals(expResult, result);
       
    }
     
      @Test
     public void testGetAllWithStudentShouldReturnList() {
        System.out.println("testGetAllWithStudentShouldReturnList");
        Course instance = new Course();
        Student students = new Student("sahil","c0657966","Male",80.3);
        Student stu = new Student("Toshif","c0657050","Male",60.4);
        instance.add(students);
        instance.add(stu);
        instance.remove(stu);
        String expResult = "[" + instance.get(0).toString() + "]";
        String result = instance.getAll().toString();
        assertEquals(expResult, result);
       
    }
     
    
     @Test
    public void testGetShouldReturnNullPointer() {
        try{
        System.out.println("testGetShouldReturnNullPointer");
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("sahil","c0657966","Male",80.3));
        Course instance = new Course(students);
        String expResult = null;
        String result = instance.get("c065796").toString();
        assertEquals(expResult, result);
       
    }
        catch(NullPointerException e){
   
        }
    }
    @Test
     public void testGetWithInvalidStudentShoulReturnNullPointer() {
        try{
        System.out.println("testGetWithInvalidStudentShoulReturnNullPointer");
        int position = -1;
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("sahil","c0657966","Male",80.3));
        Course instance = new Course(students);
        String expResult = null;
        String result = instance.get(position).toString();
        assertEquals(expResult, result);
       
    }
        catch(NullPointerException e){
   
        }
    }
    
     
      @Test
       public void testGetWithPositionGreaterOrEqualToSizeShoulReturnNullPointer() {
        try{
        System.out.println("testGetWithPositionGreaterOrEqualToSizeShoulReturnNullPointer");
        int position = 1;
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("sahil","c0657966","Male",80.3));
        Course instance = new Course(students);
        String expResult = null;
        String result = instance.get(position).toString();
        assertEquals(expResult, result);
       
    }
        catch(NullPointerException e){
   
        }
    }
    

    /**
     * Test of equals method, of class Course.
     */
  
    
    @Test
    public void testEqualsWithNonCourseObjectShouldReturnFalse() {
        System.out.println("testEqualsWithNonCourseObjectShouldReturnFalse");
        Object obj = null;
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
       
    }

     @Test
    public void testEqualsWithCourseObjectShouldReturnTrue() {
        System.out.println("testEqualsWithCourseObjectShouldReturnTrue");
        Object obj = new Course();
        Course instance = new Course();
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
       
    }
      @Test
    public void testEqualsWithCourseObjectWithDifferentListShouldReturnTrue() {
        System.out.println("testEqualsWithCourseObjectWithDifferentListShouldReturnTrue");
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("sahil","c0657966","Male",80.3));
        Course c = new Course(students);
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.equals(c);
        assertEquals(expResult, result);
       
    }
    
    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("sahil","c0657966","Male",80.3));
        Course instance = new Course(students);
        Student stu =new Student("toshif","c0657050","Male",60.3);
        instance.insert(stu, 1);
        String expResult =  "[" + instance.get(0).toString() + ", " + instance.get(1).toString() + "]";
        String result = instance.getAll().toString();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAllByGender method, of class Course.
     */
    @Test
    public void testGetAllByGender() {
        System.out.println("getAllByGender");
        String gender = "Male";
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("sahil","c0657966","Male",80.3));
        Course instance = new Course(students);
        Student stu =new Student("Simar","c0657050","Female",60.3);
        instance.insert(stu,1);
        String expResult = "[{\"name\":\"sahil\",\"id\":\"c0657966\",\"gender\":\"Male\",\"grade\":80.3}]";
        String result = instance.getAllByGender(gender).toString();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getGradeMap method, of class Course.
     */
    @Test
    public void testGetGradeMap() {
        System.out.println("getGradeMap");
        Course instance = new Course();
        Map<String, Set<Student>> expResult = null;
        Map<String, Set<Student>> result = instance.getGradeMap();
        assertEquals(expResult, result);
        
    }
    
}
