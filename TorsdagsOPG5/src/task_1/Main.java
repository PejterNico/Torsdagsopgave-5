package task_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer("Nico","Pejter" ,"ko");
        Customer c2 = new Customer("Nico","Pejter" ,"mo");
        Customer c3 = new Customer("Nico","Pejter" ,"jo");

        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);

        for(Customer cs : customers){
            System.out.println(cs);
        }
    }
}