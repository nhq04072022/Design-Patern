package edu.hus.sc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ListOrder implements IListOrder {

    private String customerId;
    List<Order> orderList = new ArrayList<>();
    Order order = new Order();

    Scanner in = new Scanner(System.in);

    //Check Customer ID Valid
    @Override
    public boolean checkCustomerId(String id) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getCustomerId().equals(id)) {
                return false;
            }
        }
        return true;
    }

    //Check Customer Id In Order
    @Override
    public boolean checkOrderCustomerId(String id) {
        if (order.checkCustomerID(id)) {
            return true;
        }
        return false;
    }
    
    //Check Customer Id In Order
    @Override
    public boolean checkOrderId(String id) {
        if (order.checkOrderID(id)) {
            return true;
        }
        return false;
    }

    //Generate Customer ID
    @Override
    public String generateCustomerId() {
        String id;
        String s = "QWERTYUIOPLKJHGFDSAZXCVBNM0987654321";
        do {
            Random r = new Random();
            id = "";
            for (int i = 0; i < 3; i++) {
                int k = r.nextInt(s.length());
                id += s.charAt(k);
            }
            if (checkCustomerId(id)) {
                return id;
            }
        } while (true);
    }

    //Get Date
    @Override
    public String getDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.now();
        return dtf.format(localDate);
    }

    //Add An Order
    @Override
    public void addOrder(Store store) {
        customerId = generateCustomerId();
        System.out.println("Customer ID: " + customerId);
        String date = getDate();
        System.out.println("Order Date: " + date);
        System.out.print("Enter customer name: ");
        String customerName = in.nextLine();//bug
        System.out.print("Enter customer address: ");
        String customerAddress = in.nextLine();
        store.print();
        char checkYn;
        order.addProduct(store, customerId, customerName, customerAddress, getDate());
        do {
            System.out.println("Add more product(y/n): ");
            checkYn = in.nextLine().charAt(0);
            if (checkYn == 'y') {
                order.addProduct(store, customerId, customerName, customerAddress, getDate());
            } else if (checkYn == 'n') {
                break;
            } else {
                System.out.println("Re-input");
            }
        } while (true);
    }

    //Print Order By Customer ID
    @Override
    public void printByCustomerId(Store store, String id) {
        order.printByCustomerId(id);
    }
    
    //Print Order By Order ID

    @Override
    public void printByOrderId(Store store, String id) {
        order.printByOrderId(id);
    }
    
    //Print All Order
    @Override
    public void print() {
        order.print();
    }

}
