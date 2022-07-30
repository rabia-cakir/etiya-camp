package com.kodlamaio.layeredarchitecture.dataaccess.concretes.nhibernate;


import com.kodlamaio.layeredarchitecture.dataaccess.abstracts.ICustomerDal;
import com.kodlamaio.layeredarchitecture.entity.concretes.Customer;

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
