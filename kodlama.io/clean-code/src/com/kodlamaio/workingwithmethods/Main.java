package com.kodlamaio.workingwithmethods;

public class Main {
    public static void main(String[] args) throws Exception {
         //CODE SMELL
          CustomerManager customerManager=new CustomerManager(new EfCustomerDal(),new KpsServiceAdapter());
//        customerManager.add("Rabia1","Çakır","1212");
//        customerManager.add("Rabia2","Çakır","1212");
//        customerManager.add("Rabia3","Çakır","1212");
//        customerManager.add("Rabia4","Çakır","1212");
//        customerManager.add("Rabia5","Çakır","1212");
//        customerManager.add("Rabia6","Çakır","1212");

        customerManager.add(new Customer(1,1,"Rabia","Çakır","1212"));
        customerManager.add(new Customer(2,1,"Elif","Çakır","1213"));


    }
}
