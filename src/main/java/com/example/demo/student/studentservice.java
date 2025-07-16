package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

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
