package com.kodlamaio.layeredarchitecture.entity.concretes;

import com.kodlamaio.layeredarchitecture.entity.abstracts.IEntity;

public class Person implements IEntity {
    public int id;
    public String firstName;
    public String lastName;
    public String identityNumber;
    public int yearOfBirth;

    public Person() {
    }

    public Person(int id, String firstName, String lastName, String identityNumber, int yearOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityNumber = identityNumber;
        this.yearOfBirth = yearOfBirth;
    }
}
