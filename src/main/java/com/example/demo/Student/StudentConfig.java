package com.example.demo.Student;

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
        return args -> {
            Student leen = new Student( "Leen" ,  LocalDate.of(2003 , Month.MAY , 24) , "jaberleen95@gmail.com");
            Student Tala = new Student( "Tala" ,  LocalDate.of(2003 , Month.MAY , 24) , "tala95@gmail.com");
            Student nadia = new Student( "nadia" , LocalDate.of(2003 , Month.MAY , 24) , "jaberleen95@gmail.com");
            repository.saveAll(
                    List.of(leen , Tala , nadia)
            );

        };

    }

}
