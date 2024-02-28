package com.cydeo.task;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100,"Mike","muke@cydeo.com", Arrays.asList("234567","324556467")),
        new Employee(100,"Ozzy","ozzy@cydeo.com", Arrays.asList("234567","3255564556467")),
        new Employee(100,"Peter","peter@cydeo.com", Arrays.asList("234567","6677324556467"))
        );
    }
}
