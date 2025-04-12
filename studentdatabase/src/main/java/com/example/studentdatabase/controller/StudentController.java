package com.example.studentdatabase.controller;

import com.example.studentdatabase.model.NewStudent;
import com.example.studentdatabase.model.Student;
import com.example.studentdatabase.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("students")
    public List<Student> getStudent(){
        return studentService.getStudent();
    }

    @GetMapping("students/newstudents")
    public List<NewStudent> getNewStudent(){
        return studentService.getNewStudent();
    }

    @PostMapping("students/addstudents")
    public String addStudent(@RequestParam("name")String name,
                             @RequestParam("email")String email,
                             @RequestParam("dept")String dept){
        studentService.addStudent(name,email,dept);
        return "successfully";
    }
}
