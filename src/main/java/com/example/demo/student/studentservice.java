package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

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
}
