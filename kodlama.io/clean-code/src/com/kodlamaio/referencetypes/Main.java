package com.kodlamaio.referencetypes;

public class Main {
    public static void main(String[] args) {
        int sayi1=20;
        int sayi2=25;
        sayi1=sayi2;
        sayi2=30;
        System.out.println(sayi1);

        int[] sayilar1=new int[] {1,2,3};
        int[] sayilar2=new int[] {4,5,6};
        sayilar1=sayilar2;
        sayilar2[0]=30;
        System.out.println(sayilar1[0]);


        Person person1=new Customer();
        Person person2=new Employee();
        PersonDal personDal=new PersonDal();
        personDal.add(person1);
        personDal.add(person2);
        personDal.add(new Visitor());

    }
}
