package com.example.studentdatabase.service;


import com.example.studentdatabase.model.NewStudent;
import com.example.studentdatabase.model.Student;
import com.example.studentdatabase.repository.NewStudentrepo;
import com.example.studentdatabase.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    NewStudentrepo newStudentrepo;
    
    public List<Student> getStudent() {
        return studentRepo.findAll();
    }

    public List<NewStudent> getNewStudent() {
        return newStudentrepo.findAll();
    }

    public void addStudent(String name, String email, String dept) {
        NewStudent newStudent=new NewStudent(name,email,dept);
        newStudentrepo.save(newStudent);
    }
}
