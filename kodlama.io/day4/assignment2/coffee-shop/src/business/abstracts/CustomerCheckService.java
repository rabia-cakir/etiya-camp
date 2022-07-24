package business.abstracts;

import entities.concretes.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer) throws Exception;
}
