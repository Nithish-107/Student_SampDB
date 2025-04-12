package com.example.studentdatabase.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NewStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollno;
    private String name;
    private String email;
    private String dept;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public NewStudent(String name, String email, String dept){
        this.name = name;
        this.email = email;
        this.dept = dept;
    }
public NewStudent(){

}
}
