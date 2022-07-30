package com.kodlamaio.coursesale.ui;

import com.kodlamaio.coursesale.business.abstacts.ICourseService;
import com.kodlamaio.coursesale.business.concretes.CourseManager;
import com.kodlamaio.coursesale.business.concretes.StandardPriceCampaignManager;
import com.kodlamaio.coursesale.dataaccess.concretes.EfCourseDal;
import com.kodlamaio.coursesale.entity.concretes.Course;

public class Main {
    public static void main(String[] args) {
        Course course1=new Course(1,"c# kursu",50.0);
        Course course2=new Course(2,"java kursu",50.0);
        Course course3=new Course(3,"python kursu",50.0);

        ICourseService iCourseService=new CourseManager(new EfCourseDal(),new StandardPriceCampaignManager());
        iCourseService.add(course1);
        iCourseService.add(course2);
        iCourseService.add(course3);

        for (Course course:iCourseService.getAll())
            System.out.println("course name = "+course.name+" : course price = "+course.price);

    }
}
