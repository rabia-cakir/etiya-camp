package business.concretes;

import business.abstracts.BaseCustomerManager;
import entities.concretes.Customer;
import business.abstracts.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private CustomerCheckService customerCheckService;
    public  StarbucksCustomerManager(CustomerCheckService customerCheckService)
    {
        this.customerCheckService=customerCheckService;
    }
    @Override
    public void save(Customer customer) throws Exception {
        if (customerCheckService.checkIfRealPerson(customer))
            super.save(customer);
        else
            System.out.println("not a valid person");
    }


}
