package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student denisa = new Student(
                    "Denisa",
                    "denisa@gmail.com",
                    LocalDate.of(1999, 6, 28)
            );
            Student david = new Student(
                    "David",
                    "david@gmail.com",
                    LocalDate.of(2017, 5, 25)
            );

            repository.saveAll(
                    List.of(denisa, david)
            );
        };
    }
}
