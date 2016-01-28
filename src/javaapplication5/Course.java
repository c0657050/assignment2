/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author c0667381
 */
public class Course {

    private List<Student> students;
    private Object GradeMap;

    public Course(List<Student> students) {
        this.students = students;
    }

    public Course() {
        students = new ArrayList<>();

    }

    public void add(Student student) {
        students.add(student);
    }

    public void remove(Student student) {
        students.remove(student);
    }

    public void remove(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.remove(i);
            }
        }
    }

    public void remove(int position) {
        students.remove(position);
    }

    public void insert(Student student, int position) {
        this.students.add(position, student);
    }

    public Student get(String id) {
        Student stu = new Student();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                stu = student;
            } else {
                stu = null;
            }
        }
        return stu;
    }

    public Student get(int position) {
        if (0 <= position && position < students.size()) {
            return students.get(position);
        } else {
            return null;
        }
    }

    public List<Student> getAll() {
        if (students.isEmpty()) {
            return null;
        } else {
            return students;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Course) {
            Course c = new Course();
            c = (Course) obj;
            return this.students.equals(c.students);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String result = "[";
        for (Student student : students) {
            result += student.toString() + "," + "\n";
        }
        result = result.substring(0, result.length() - 2) + "]";
        return result;
    }

    public Set<Student> getAllByGender(String gender) {
        Set<Student> setByGender = new HashSet<>();
        for (Student student : students) {
            if (student.getGender().equals(gender)) {
                setByGender.add(student);
            }
        }
        return setByGender;
    }

    public Map<String, Set<Student>> getGradeMap() {
        Map<String, Set<Student>> GradeMap = new HashMap();
        String Grades[] = {"A", "B", "C", "D", "F"};
        String letterGrade = "";
        for (String key : Grades) {
            Set<Student> st = new HashSet();
            for (Student student : students) {
                if (student.getGrade() > 80 && student.getGrade() <= 100) {
                    letterGrade = "A";
                } else if (student.getGrade() > 70 && student.getGrade() <= 79) {
                    letterGrade = "B";
                } else if (student.getGrade() > 60 && student.getGrade() <= 69) {
                    letterGrade = "C";
                } else if (student.getGrade() > 50 && student.getGrade() <= 59) {
                    letterGrade = "D";
                } else if (student.getGrade() > 0 && student.getGrade() <= 49) {
                    letterGrade = "F";
                }
                if (key.equals(letterGrade)) {
                    st.add(student);
                }
            }
            if (!st.isEmpty()) {
                GradeMap.put(key, st);
            }
        }
            return GradeMap;
        }
}
    
