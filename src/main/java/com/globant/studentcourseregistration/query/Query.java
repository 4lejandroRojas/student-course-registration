package com.globant.studentcourseregistration.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
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

}
