package business.concretes;

import business.abstracts.UserService;
import core.utilities.adapter.CheckIfMailExistsService;
import core.utilities.adapter.CheckIfMailExistsService;
import core.utilities.patterns.RegexMatches;
import dataAccess.abstracts.DataRepository;
import entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {
    private RegexMatches regexMatches;
    private DataRepository<User> dataRepository;
    private CheckIfMailExistsService checkIfMailExistsService;


    public UserManager(RegexMatches regexMatches, DataRepository dataRepository,
                       CheckIfMailExistsService checkIfMailExistsService) {
        this.regexMatches = regexMatches;
        this.dataRepository = dataRepository;
        this.checkIfMailExistsService=checkIfMailExistsService;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public void add(User user) {

        if (regexMatches.namePattern(user.getFirstName()) && regexMatches.namePattern(user.getLastName())) {
            if (regexMatches.emailPattern(user.getEmail()) && regexMatches.passwordPattern(user.getPassword())) {
                if (!checkIfEmailExists(user.getEmail())) {
                    dataRepository.add(user);
                    System.out.println("user added successfully");
                    System.out.println("verification email has been sent");
                }
                else
                    System.out.println("email already exist");

            } else

                System.out.println("email or password is not valid");

        } else
            System.out.println("first name and last name must contain at least two characters");

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    private boolean checkIfEmailExists(String email)
    {
        boolean exists=false;
        for (User user:dataRepository.getAll())
        {
            if (user.getEmail()==email)
            {
                exists=true;
            }
        }
        return exists;
    }


    public void loginCheck(String email, String password)
    {
        for (User user:dataRepository.getAll())
        {
            if (user.getEmail()==email && user.getPassword()==password)
            {
                System.out.println("login succesfully");
            }
            else
                System.out.println("login failed");
        }
    }

    public void loginWithGoogle(String email)
    {
        checkIfMailExistsService.checkIfMailExists(email);
    }
}
