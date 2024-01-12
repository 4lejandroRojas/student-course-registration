package com.globant.studentcourseregistration.query;

import com.globant.studentcourseregistration.entity.Subject;
import com.globant.studentcourseregistration.response.StudentResponse;
import com.globant.studentcourseregistration.response.SubjectResponse;
import graphql.kickstart.tools.GraphQLResolver;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SubjectResolver implements GraphQLResolver<StudentResponse>  {
  public List<SubjectResponse> learningSubjects(StudentResponse studentResponse) {
    log.info("Getting learning subjects for student id: {}", studentResponse.getId());
    List<SubjectResponse> learningSubjects = new ArrayList<>();

    if (studentResponse.getStudent().getLearningSubjects() != null) {
      for (Subject subject: studentResponse.getStudent().getLearningSubjects()) {
        learningSubjects.add(new SubjectResponse(subject));
      }
    }

    return learningSubjects;

  }

  public String fullName(StudentResponse studentResponse) {
    log.info("Getting full name");
    return studentResponse.getFirstName() + " " + studentResponse.getLastName();
  }

}
