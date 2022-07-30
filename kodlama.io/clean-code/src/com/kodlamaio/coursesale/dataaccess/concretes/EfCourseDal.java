package com.kodlamaio.coursesale.dataaccess.concretes;

import com.kodlamaio.coursesale.dataaccess.abstracts.ICourseDal;
import com.kodlamaio.coursesale.entity.concretes.Course;

import java.util.ArrayList;
import java.util.List;

public class EfCourseDal implements ICourseDal {
    List<Course> courses=new ArrayList<>();


    @Override
    public void add(Course course) {
        courses.add(course);

    }

    @Override
    public List<Course> getAll() {
        return courses;
    }
}
