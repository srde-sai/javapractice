package srd.srdesai.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import srd.srdesai.model.Course;
import srd.srdesai.repository.CourseRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements CrudService<Course> {

    private CourseRepo repo;

    public CourseService(CourseRepo courseRepo) {
    repo = courseRepo;

    }

    @Override
    public List<Course> list1() {
        return repo.findAll();
    }

    @Override
    public Course create(Course course) {
        return null;
    }

    @Override
    public Optional<Course> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Course course, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
