package model;

import java.util.List;

public class Student extends User{
    private double progress;
    private List<String> registeredCourses;

    public Student() {
    }

    public Student(int id, String firstName, String lastName,
                   String email, String password, double progress, List<String> registeredCourses )
    {
        super(id,firstName,lastName,email,password);
        this.progress=progress;
        this.registeredCourses=registeredCourses;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public List<String> getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(List<String> registeredCourses) {
        this.registeredCourses = registeredCourses;
    }
}
