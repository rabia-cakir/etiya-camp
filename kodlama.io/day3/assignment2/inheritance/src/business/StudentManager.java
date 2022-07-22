package business;

import model.Student;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class StudentManager extends UserManager {

    private List<Student> students;

    public StudentManager()
    {
        students=new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void add(Student student) {
        if (!checkIfStudentExists(student.getId())) {
            students.add(student);
            add(student);
        }
        else
            System.out.println("Student already exists");
    }

    public void delete(Student student) {
        if (checkIfStudentExists(student.getId())) {
            students.remove(student);
            delete(student);
        }
        else
            System.out.println("Student not found");
    }


    private boolean checkIfStudentExists(int id)
    {
        boolean exists=false;
        for (Student student: students)
        {
            if (student.getId()==id)
                exists=true;
        }

        return exists;
    }
}
