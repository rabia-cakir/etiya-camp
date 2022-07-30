package com.kodlamaio.workingwithmethods;

public class NhCustomerDal implements ICustomerDal {
    @Override
    public void add(Customer customer) {
        System.out.println("Nhibernate kullanarak veritabanına eklendi.");
    }

    @Override
    public boolean customerExists(Customer customer) {
        return true;
    }
}
