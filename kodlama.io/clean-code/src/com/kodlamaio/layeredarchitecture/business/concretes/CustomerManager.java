package com.kodlamaio.layeredarchitecture.business.concretes;


import com.kodlamaio.layeredarchitecture.business.abstracts.ICustomerService;
import com.kodlamaio.layeredarchitecture.business.abstracts.IPersonService;
import com.kodlamaio.layeredarchitecture.dataaccess.abstracts.ICustomerDal;
import com.kodlamaio.layeredarchitecture.entity.concretes.Customer;

public class CustomerManager implements ICustomerService {
    ICustomerDal customerDal;
    IPersonService personService;
    public CustomerManager(ICustomerDal customerDal, IPersonService personService)
    {
        this.customerDal=customerDal;
        this.personService=personService;
    }
    public void add(Customer customer) throws Exception {


        validateFirstNameIfEmpty(customer);
        validateLastNameIfEmpty(customer);
        validateIdentityNumberIfEmpty(customer);
        checkCustomerExists(customer);
        customerDal.add(customer);

    }

    public void addByOtherBusiness(Customer customer) throws Exception {

        validateFirstNameLength(customer);
        validateFirstNameIfEmpty(customer);
        validateLastNameIfEmpty(customer);
        validateIdentityNumberIfEmpty(customer);
        checkCustomerExists(customer);
        customerDal.add(customer);

    }

    private void validateFirstNameIfEmpty(Customer customer) throws Exception {
        if (customer.firstName.equals(null))
            throw new Exception("isim giriniz");
    }

    private void validateLastNameIfEmpty(Customer customer) throws Exception {
        if (customer.lastName.equals(null))
            throw new Exception("soyisim giriniz");
    }

    private void validateIdentityNumberIfEmpty(Customer customer) throws Exception {
        if (customer.identityNumber.equals(null))
            throw new Exception("kimlik numarası giriniz");
    }

    private void validateFirstNameLength(Customer customer) throws Exception {
        if (customer.firstName.length()<2)
            throw new Exception("min iki karakter girilmelidir.");
    }

    private void checkCustomerExists(Customer customer) throws Exception {
        if(customerDal.customerExists(customer)) {
            throw new Exception("müşteri zaten mevcut");
        }
    }
}
