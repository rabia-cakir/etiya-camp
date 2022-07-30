package com.kodlamaio.layeredarchitecture.dataaccess.concretes.entityframework;

import com.kodlamaio.layeredarchitecture.dataaccess.abstracts.ICustomerDal;
import com.kodlamaio.layeredarchitecture.entity.concretes.Customer;


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
