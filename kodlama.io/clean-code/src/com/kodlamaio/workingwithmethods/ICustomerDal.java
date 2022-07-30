package com.kodlamaio.workingwithmethods;

public interface ICustomerDal {
    void add(Customer customer);
    boolean customerExists(Customer customer);
}
