package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class studentservice {
    public List<student> getstudents() {
        return List.of(
                new student(
                        1L,
                        "pushpika",
                        "pushpika@gmail.com",
                        LocalDate.of(2001, Month.JANUARY, 3),
                        21


                )
        );
    }
}
