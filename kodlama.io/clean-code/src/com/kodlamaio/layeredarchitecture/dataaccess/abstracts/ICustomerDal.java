package com.kodlamaio.layeredarchitecture.dataaccess.abstracts;


import com.kodlamaio.layeredarchitecture.entity.concretes.Customer;

public interface ICustomerDal {
    void add(Customer customer);
    boolean customerExists(Customer customer);
}
