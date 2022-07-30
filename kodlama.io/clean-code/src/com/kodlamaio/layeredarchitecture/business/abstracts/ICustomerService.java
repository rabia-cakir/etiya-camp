package com.kodlamaio.layeredarchitecture.business.abstracts;

import com.kodlamaio.layeredarchitecture.entity.concretes.Customer;

public interface ICustomerService {
     void add(Customer customer) throws Exception;
     void addByOtherBusiness(Customer customer) throws Exception;
}
