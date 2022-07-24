package business.abstracts;

import entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {
    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("saved to db : "+customer.getFirstName());
    }
}
