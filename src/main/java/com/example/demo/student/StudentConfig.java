package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student saron = new Student (
                    "Saron",
                    "saron.mu@gmail.com",
                    LocalDate.of(1999, MARCH, 5)
            );
            Student noah = new Student(
                    "Alex",
                    "ally.m@gmail.com",
                    LocalDate.of(1998, Month.MARCH, 8)
            );
            repository.saveAll(
                    List.of(saron, noah)
            );
        };
    }
}
