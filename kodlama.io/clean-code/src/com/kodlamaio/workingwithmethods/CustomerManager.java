package com.kodlamaio.workingwithmethods;

public class CustomerManager {
//    CODE SMELL
//    public void add(String firstName, String lastName, String identityNumber)
//    {
//        System.out.println("eklendi");
//    }



//        CODE SMELL
//        public void add(Customer customer)
//        {
//            //TECHNICAL DEBT
//            //validasyonla iş kodu aynı metodun içinde yazıldı
//            if(!customer.firstName.equals(null) &&
//                    !customer.lastName.equals(null) &&
//                    !customer.identityNumber.equals(null) )
//            System.out.println("eklendi");
//        }


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

//    CODE SMELL
//    private void validate(Customer customer) throws Exception {
//        if (!customer.firstName.equals(null) ||
//                !customer.lastName.equals(null) ||
//                !customer.identityNumber.equals(null)) {
//            throw new Exception("Validasyon hatası oluştu");
//        }
//    }

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
