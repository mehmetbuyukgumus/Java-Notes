package arrayListWithClass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customers> customers = new ArrayList<Customers>();
        customers.add(new Customers(1, "Mehmet", "Büyükgümüş"));
        customers.add(new Customers(2, "Ahmet", "Büyükgümüş"));
        customers.add(new Customers(3, "İbrahim", "Büyükgümüş"));
        for (Customers customer : customers) {
            System.out.println(customer.id);
        }

    }

}
