package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateString {

    public static void main(String[] args) {

        //Creating Stream from Array

        String[] courses = {"Java", "Spring", "Agile"};

        Stream<String> courseStream = Arrays.stream(courses);



        //Creating Stream from Collection
        List<String> courseList = Arrays.asList("Java", "Spring", "Agile");
        Stream<String> courseList2 = courseList.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java",100),
                new Course("DS",101),
                new Course("MS",102)
        );

        Stream<Course> myCourseStream = myCourses.stream();

        //Creating Stream Values
        Stream<Integer> stream = Stream.of(1,2,3,4);





    }
}
