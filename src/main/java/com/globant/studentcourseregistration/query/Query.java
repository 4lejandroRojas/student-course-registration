package com.globant.studentcourseregistration.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;


@Component
public class Query implements GraphQLQueryResolver {
  public String firstQuery() {
    return "First Query";
  }

}
