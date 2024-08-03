package com.student.StudentManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@ComponentScan("com.student.StudentManagement.security")
@ComponentScan("com.student.StudentManagement.service.CustomUserDetailsService")
@ComponentScan("com.student.StudentManagement.security.JwtAuthenticationFilter")
@Configuration
public class StudentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

}
