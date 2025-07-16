package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class studentcontoller {

    @GetMapping
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
