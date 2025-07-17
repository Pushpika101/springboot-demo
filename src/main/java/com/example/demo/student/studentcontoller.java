package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class studentcontoller {

    private final studentservice studentservice;
    @Autowired
    public studentcontoller(studentservice studentservice) {
        this.studentservice = studentservice;
    }

    @GetMapping
    public List<student> getStudents(){
        return studentservice.getstudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody student student){
        studentservice.addNewStudent(student);
    }

    @DeleteMapping
    public void deleteStudent(@RequestParam("id") Long studentid){
        studentservice.deletestudent(studentid);
    }



}
