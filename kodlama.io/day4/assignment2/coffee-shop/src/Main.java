import adapters.MernisServiceAdapter;
import business.abstracts.BaseCustomerManager;
import business.concretes.NeroCustomerManager;
import business.concretes.StarbucksCustomerManager;
import entities.concretes.Customer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1,"RABİA","ÇAKIR",
                LocalDate.parse("1998-01-13"),"11968216914"));


    }
}