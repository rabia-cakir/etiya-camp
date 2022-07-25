public class Main {
    public static void main(String[] args) {
        Canal canal = new Canal(1,"Internet");

        Customer customer1 = new IndividualCustomer(1,"1234",canal,"Rabia","Çakır","1234567890");
        System.out.println(customer1.getId());
        System.out.println(customer1.getCustomerNumber());
        System.out.println(customer1.getCanal().getName());

    }
}