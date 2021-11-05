package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    1L,
                    "Mariam",
                    "mariam@mail.ru",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );
            Student alex = new Student(
                    2L,
                    "Alexander",
                    "alex@mail.ru",
                    LocalDate.of(1988, Month.JANUARY, 15)
            );
            repository.saveAll(
                    Arrays.asList(mariam, alex)
            );
        };
    }

}
