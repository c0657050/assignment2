/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Toshif Sheikh
 */
public class Student {

    String name;
    String id;
    String gender;
    Double grade;

    public Student(){
    }
    public String getName() {
        return name;
    }

    public Student(String name, String id, String gender, Double grade) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {

        return "{\"name\":\"" + getName()+ "\",\"id\":\""+getId()+ "\",\"gender\":\""+ getGender()+"\",\"grade\":"+getGrade() + "}";
    }

    public boolean equals(Student stu) {
        if (this.getClass() != stu.getClass()) {
            return false;
        }
        return this.name.equals(stu.getName()) && this.id.equals(stu.getId());
    }
}
