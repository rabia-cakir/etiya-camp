package com.kodlamaio.coursesale.business.concretes;

import com.kodlamaio.coursesale.business.abstacts.ICampaignService;
import com.kodlamaio.coursesale.dataaccess.abstracts.ICourseDal;
import com.kodlamaio.coursesale.business.abstacts.ICourseService;
import com.kodlamaio.coursesale.entity.concretes.Course;

import java.util.List;

public class CourseManager implements ICourseService {
    ICourseDal iCourseDal;
    ICampaignService iCampaignService;
    public CourseManager(ICourseDal iCourseDal, ICampaignService iCampaignService)
    {
        this.iCourseDal=iCourseDal;
        this.iCampaignService=iCampaignService;
    }

    @Override
    public void add(Course course) {
        iCourseDal.add(course);
    }

    @Override
    public List<Course> getAll() {
        List<Course> courses=iCourseDal.getAll();
        iCampaignService.updatePrice(courses);
        return iCourseDal.getAll();
    }





}
