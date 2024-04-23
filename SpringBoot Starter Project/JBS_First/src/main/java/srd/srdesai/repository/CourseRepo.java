package srd.srdesai.repository;

import org.springframework.stereotype.Repository;
import srd.srdesai.model.Course;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepo implements CrudRepo<Course> {
    @Override
    public List<Course> findAll() {
        List<Course> courses = new ArrayList<>();
        Course springBoot = new Course(1,
                "Getting Started with Spring",
                "Learn how to build real apps with Spring Boot 2",
                "Https://www.google.com");

        courses.add(springBoot);
        return  courses;
    }
}
