package com.kodlamaio.coursesale.business.abstacts;

import com.kodlamaio.coursesale.entity.concretes.Course;

import java.util.List;

public interface ICampaignService {
    void updatePrice(List<Course> courses);
}
