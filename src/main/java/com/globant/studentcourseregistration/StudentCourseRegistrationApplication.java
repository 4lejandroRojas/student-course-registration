package com.globant.studentcourseregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.globant.studentcourseregistration.query"})
public class StudentCourseRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentCourseRegistrationApplication.class, args);
	}

}
