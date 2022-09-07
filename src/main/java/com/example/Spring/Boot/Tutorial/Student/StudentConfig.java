package com.example.Spring.Boot.Tutorial.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.OCTOBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student maryam = new Student("Maryam", "maryam@gmail.com", LocalDate.of(2002, APRIL, 29));
            Student hamza = new Student("Hamza", "hamza@gmail.com", LocalDate.of(2000, OCTOBER, 16));

            repository.saveAll(List.of(maryam,hamza));
        };
    }
}
