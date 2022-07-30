package com.kodlamaio.coursesale.dataaccess.abstracts;

import com.kodlamaio.coursesale.entity.concretes.Course;

import java.util.List;

public interface ICourseDal {
    void add(Course course);
    List<Course> getAll();
}
