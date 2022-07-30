package com.kodlamaio.layeredarchitecture.business.abstracts;


import com.kodlamaio.layeredarchitecture.entity.concretes.Person;

public interface IPersonService {
    boolean checkPerson(Person person) throws Exception;
}
