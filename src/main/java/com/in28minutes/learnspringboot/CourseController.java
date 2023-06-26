package com.in28minutes.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
//    courses
//    course: id, name , author
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn Aws", "in28Minutes"),
                new Course(2, "Learn devOps", "in28Minutes")
        );
    }
}
