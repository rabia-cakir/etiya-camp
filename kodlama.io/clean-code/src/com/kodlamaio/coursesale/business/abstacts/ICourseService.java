package com.kodlamaio.coursesale.business.abstacts;

import com.kodlamaio.coursesale.entity.concretes.Course;

import java.util.List;

public interface ICourseService {
    void add(Course course);
    List<Course> getAll();

}
