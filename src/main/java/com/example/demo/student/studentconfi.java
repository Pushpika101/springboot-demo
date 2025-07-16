package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class studentconfi {

    @Bean
    CommandLineRunner commandLineRunner(studentrepo repository) {
        return args -> {
            student pushpika = new student(
                    "pushpika",
                    "pushpika@gmail.com",
                    LocalDate.of(2001, Month.JANUARY, 3),
                    21

            );

            student kt = new student(
                    "kt",
                    "kt@gmail.com",
                    LocalDate.of(2002, Month.JANUARY, 7),
                    21

            );

            repository.saveAll(
                    List.of(pushpika, kt)
            );
        };
    }
}
