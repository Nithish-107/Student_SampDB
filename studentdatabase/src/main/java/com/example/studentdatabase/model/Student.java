package com.example.studentdatabase.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;

@Entity
public class Student {
    @Id
    private int rollno;
    private String name;
    private String dept;
    private String email;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(String name, int rollno, String dept, String email) {
        this.name = name;
        this.rollno = rollno;
        this.dept = dept;
        this.email = email;
    }

    public Student() {
    }
}
