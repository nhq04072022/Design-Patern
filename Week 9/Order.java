package edu.hus.sc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Order {

    private String orderId;
    private String customerId;
    List<InformationOrder> infoOrderList = new ArrayList<>();

    Scanner in = new Scanner(System.in);

    public Order() {
    }

    //Check Order ID Valid
    public boolean checkOrderID(String id) {
        for (int i = 0; i < infoOrderList.size(); i++) {
            if (infoOrderList.get(i).getOrderId().equals(id)) {
                return false;
            }
        }
        return true;
    }

    //Generate Order ID
    public String generateOrderID() {
        String id;
        String s = "QWERTYUIOPLKJHGFDSAZXCVBNM0987654321";
        do {
            Random r = new Random();
            id = "";
            for (int i = 0; i < 3; i++) {
                int k = r.nextInt(s.length());
                id += s.charAt(k);
            }
            if (checkOrderID(id)) {
                return id;
            }
        } while (true);
    }

    //Check Customer ID Valid
    public boolean checkCustomerID(String id) {
        for (int i = 0; i < infoOrderList.size(); i++) {
            if (infoOrderList.get(i).getCustomerId().equals(id)) {
                return false;
            }
        }
        return true;
    }

    //Add new product in order
    public void addProduct(Store store, 
            String customerID, 
            String customerName, 
            String address, String date) {
        System.out.print("Enter product id: ");
        String id = in.nextLine();
        if (!store.checkProductId(id)) {
            System.out.print("Enter quantity: ");
            int quantity = Integer.parseInt(in.nextLine());
            infoOrderList.add(new InformationOrder(generateOrderID(), 
                    customerID, 
                    customerName, 
                    id, 
                    store.getProductName(id), 
                    address, 
                    date, 
                    quantity, 
                    quantity * store.getProductPrice(id)));
        } else {
            System.out.println("Not found id!!!");
        }
    }

    //Print All Order
    public void print() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", 
                "Customer ID", 
                "Order ID", 
                "Name Customer", 
                "Product ID", 
                "Product Name", 
                "Date", 
                "Address", 
                "Quantity", 
                "Price");
        for (int i = 0; i < infoOrderList.size(); i++) {
            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15d%-15.2f\n", 
                    infoOrderList.get(i).getCustomerId(), 
                    infoOrderList.get(i).getOrderId(), 
                    infoOrderList.get(i).getCustomerName(), 
                    infoOrderList.get(i).getProductID(), 
                    infoOrderList.get(i).getProductName(), 
                    infoOrderList.get(i).getDate(), 
                    infoOrderList.get(i).getAddress(), 
                    infoOrderList.get(i).getQuantity(), 
                    infoOrderList.get(i).getPrice());
        }
    }

    //Print Order By CustomId
    public void printByCustomerId(String id) {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", 
                "Customer ID", 
                "Order ID", 
                "Name Customer", 
                "Product ID", 
                "Product Name", 
                "Date", "Address", 
                "Quantity", "Price");
        for (int i = 0; i < infoOrderList.size(); i++) {
            if (infoOrderList.get(i).getCustomerId().equals(id)) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15d%-15.2f\n", 
                        infoOrderList.get(i).getCustomerId(), 
                        infoOrderList.get(i).getOrderId(), 
                        infoOrderList.get(i).getCustomerName(), 
                        infoOrderList.get(i).getProductID(), 
                        infoOrderList.get(i).getProductName(), 
                        infoOrderList.get(i).getDate(), 
                        infoOrderList.get(i).getAddress(), 
                        infoOrderList.get(i).getQuantity(), 
                        infoOrderList.get(i).getPrice());
            }
        }
    }
    
    //Print Order By OrderId
    public void printByOrderId(String id) {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", 
                "Customer ID", 
                "Order ID", 
                "Name Customer", 
                "Product ID", 
                "Product Name", 
                "Date", 
                "Address", 
                "Quantity", 
                "Price");
        for (int i = 0; i < infoOrderList.size(); i++) {
            if (infoOrderList.get(i).getOrderId().equals(id)) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15d%-15.2f\n", 
                        infoOrderList.get(i).getCustomerId(), 
                        infoOrderList.get(i).getOrderId(), 
                        infoOrderList.get(i).getCustomerName(), 
                        infoOrderList.get(i).getProductID(), 
                        infoOrderList.get(i).getProductName(), 
                        infoOrderList.get(i).getDate(), 
                        infoOrderList.get(i).getAddress(), 
                        infoOrderList.get(i).getQuantity(), 
                        infoOrderList.get(i).getPrice());
                return;
            }
        }
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<InformationOrder> getInfoOrderList() {
        return infoOrderList;
    }

    public void setInfoOrderList(List<InformationOrder> a) {
        this.infoOrderList = a;
    }

    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }
}
