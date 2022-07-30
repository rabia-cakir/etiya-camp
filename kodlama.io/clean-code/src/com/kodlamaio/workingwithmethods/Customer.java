package com.kodlamaio.workingwithmethods;

public class Customer extends Person {

    public int cityId;


    public Customer() {
    }

    public Customer(int id, int cityId, String firstName, String lastName, String identityNumber) {
        this.id = id;
        this.cityId = cityId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityNumber = identityNumber;
    }
}
