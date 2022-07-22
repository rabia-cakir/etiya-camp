package model;

import java.util.List;

public class Instructor extends User {
    private double salary;
    private List<String> givenCourses;

    public Instructor() {
    }

    public Instructor(int id, String firstName, String lastName,
                      String email, String password, double salary, List<String> givenCourses) {
        super(id, firstName, lastName, email, password);
        this.salary = salary;
        this.givenCourses = givenCourses;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getGivenCourses() {
        return givenCourses;
    }

    public void setGivenCourses(List<String> givenCourses) {
        this.givenCourses = givenCourses;
    }
}
