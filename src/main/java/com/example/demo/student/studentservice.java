package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class studentservice {

    private  final studentrepo studentrepo;

    @Autowired
    public studentservice(studentrepo studentrepo) {
        this.studentrepo = studentrepo;
    }

    public List<student> getstudents() {
        return studentrepo.findAll();
    }


    public void addNewStudent(student student) {
        Optional<student> studentOptional= studentrepo.findstudentsByemail(student.getEmail());
        if(studentOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        studentrepo.save(student);
    }
}