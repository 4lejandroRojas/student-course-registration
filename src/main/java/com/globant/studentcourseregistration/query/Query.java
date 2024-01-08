package com.globant.studentcourseregistration.query;

import com.globant.studentcourseregistration.request.SampleRequest;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


@Controller
public class Query implements GraphQLQueryResolver {

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

}
