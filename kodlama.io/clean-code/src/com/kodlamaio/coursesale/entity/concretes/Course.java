package com.kodlamaio.coursesale.entity.concretes;

public class Course {
    public int id;
    public String name;
    public double price;

    public Course() {
    }

    public Course(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
