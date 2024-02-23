package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args->{
            Student ana = new Student(

                    "Ana",
                    "Ana@gmail.com",
                    LocalDate.of(1999, Month.APRIL, 5)

            );
            Student bia = new Student(

                    "Bia",
                    "Bia@gmail.com",
                    LocalDate.of(1992, Month.APRIL, 5)
            );
            repository.saveAll(
                    List.of(ana,bia)
            );

        };
    }
}
