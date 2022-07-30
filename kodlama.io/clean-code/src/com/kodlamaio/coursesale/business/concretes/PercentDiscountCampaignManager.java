package com.kodlamaio.coursesale.business.concretes;

import com.kodlamaio.coursesale.business.abstacts.ICampaignService;
import com.kodlamaio.coursesale.entity.concretes.Course;

import java.util.List;

public class PercentDiscountCampaignManager implements ICampaignService {
    @Override
    public void updatePrice(List<Course> courses) {
        for (Course course: courses)
            course.price=course.price-(course.price*getPercentageDiscount());
    }

    private double getPercentageDiscount() {
        //connect to db
        return 0.90;
    }
}
