package com.globant.studentcourseregistration.query;

import com.globant.studentcourseregistration.request.SampleRequest;
import com.globant.studentcourseregistration.response.StudentResponse;
import com.globant.studentcourseregistration.service.StudentService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


@Controller
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

  private final StudentService studentService ;

  @QueryMapping
  public String firstQuery() {
    return "First Query";
  }

  @QueryMapping
  public String secondQuery() {
    return "Second Query";
  }

  @QueryMapping
  public String fullName(@Argument SampleRequest sampleRequest) {
    return sampleRequest.getFirstName() + " " + sampleRequest.getLastName();
  }

  @QueryMapping
  public StudentResponse student(@Argument long id){
    return new StudentResponse(studentService.getStudentById(id));
  }

}
