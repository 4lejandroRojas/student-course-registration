package com.globant.studentcourseregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({
		"com.globant.studentcourseregistration.query",
		"com.globant.studentcourseregistration.service"})
@EntityScan("com.globant.studentcourseregistration.entity")
@EnableJpaRepositories("com.globant.studentcourseregistration.repository")
public class StudentCourseRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentCourseRegistrationApplication.class, args);
	}

}
