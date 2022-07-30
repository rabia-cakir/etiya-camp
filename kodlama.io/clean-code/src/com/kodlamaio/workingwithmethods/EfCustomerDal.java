package com.kodlamaio.workingwithmethods;

public class EfCustomerDal implements ICustomerDal {
    @Override
    public void add(Customer customer) {
        System.out.println("Entity Framework kullanarak veritabanına eklendi.");
    }

    @Override
    public boolean customerExists(Customer customer) {
        return true;
    }
}
