package com.example.Studentinfo.service;

import com.example.Studentinfo.model.Student;
import com.example.Studentinfo.repository.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Studentservice {
    @Autowired
    private Studentrepo repo;
    public Student createstudent(Student student) {
        return repo.save(student);
    }


}
