package com.kodlamaio.coursesale.business.concretes;

import com.kodlamaio.coursesale.business.abstacts.ICampaignService;
import com.kodlamaio.coursesale.entity.concretes.Course;

import java.util.List;

public class StandardPriceCampaignManager implements ICampaignService {
    @Override
    public void updatePrice(List<Course> courses) {
        for (Course course: courses)
            course.price=getCurrentBasePrice();
    }
    private double getCurrentBasePrice() {
        //connect to db
        return 25;
    }
}
