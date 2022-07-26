import business.InstructorManager;
import business.StudentManager;
import business.UserManager;
import jdk.swing.interop.SwingInterOpUtils;
import model.Instructor;
import model.Student;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User instructor1 = new Instructor(1, "rabia", "çakır",
                "rabiacakir@gmail.com", "123456", 50.0, new ArrayList<>());
        Instructor instructor2 = new Instructor(2, "mine", "çakır",
                "rabiacakir@gmail.com", "123456", 50.0, new ArrayList<>());
        User student1 = new Student(3, "elif", "çakır",
                "elifcakir@gmail.com", "ABCD", 0.10, new ArrayList<>());
        Student student2 = new Student(4, "ali", "çakır",
                "alicakir@gmail.com", "abc123", 0.50, new ArrayList<>());


        UserManager manager1 = new InstructorManager();
        manager1.add(instructor1);
        manager1.add(instructor2);


        UserManager manager2 = new StudentManager();
        manager2.add(student1);
        manager2.add(student2);


    }
}
