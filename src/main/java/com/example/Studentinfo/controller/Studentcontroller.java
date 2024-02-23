package com.example.Studentinfo.controller;

import com.example.Studentinfo.model.Student;
import com.example.Studentinfo.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sriindu")
public class Studentcontroller {
    @Autowired
    private Studentservice service;
    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody  Student student){
        return service.createstudent(student);
    }
}
