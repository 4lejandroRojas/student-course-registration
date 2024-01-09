package com.globant.studentcourseregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globant.studentcourseregistration.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
