package com.example.studentdatabase.repository;

import com.example.studentdatabase.model.NewStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewStudentrepo extends JpaRepository<NewStudent,Integer> {
}
