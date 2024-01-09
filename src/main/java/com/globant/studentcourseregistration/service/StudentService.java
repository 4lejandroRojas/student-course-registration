package com.globant.studentcourseregistration.service;

import com.globant.studentcourseregistration.entity.Student;
import com.globant.studentcourseregistration.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

  private final StudentRepository studentRepository;

  public Student getStudentById(long id) {
    return studentRepository.findById(id).get();
  }

}
