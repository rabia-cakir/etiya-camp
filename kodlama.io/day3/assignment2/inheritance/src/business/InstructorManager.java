package business;

import model.Instructor;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager extends UserManager {
    private List<Instructor> instructors;

    public InstructorManager()
    {
        instructors=new ArrayList<>();
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void add(Instructor instructor) {
        if(!checkIfInstructorExists(instructor.getId()))
        {
            instructors.add(instructor);
            add(instructor);
        }
        else
            System.out.println("Instructor already exists");
    }

    public void delete(Instructor instructor) {
        if (checkIfInstructorExists(instructor.getId()))
        {
            instructors.remove(instructor);
            delete(instructor);
        }
        else
            System.out.println("Instructor not found");

    }

    private boolean checkIfInstructorExists(int id)
    {
        boolean exists=false;
        for (Instructor instructor:instructors)
        {
            if (instructor.getId()==id)
                exists=true;
        }
        return exists;
    }


}
