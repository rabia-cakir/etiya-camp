package business;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }


    public List<User> getUsers() {
        return users;
    }


    public void add(User user) {
        if (!checkIfUserExist(user.getId()))
            users.add(user);


        else
            System.out.println("User already exists");
    }

    public void delete(User user) {
        if (checkIfUserExist(user.getId()))
            users.remove(user);
        else
            System.out.println("User not found");
    }


    private boolean checkIfUserExist(int id) {
        boolean exists = false;
        for (User user : users) {
            if (user.getId() == id) {
                exists = true;
            }
        }
        return exists;
    }


}
