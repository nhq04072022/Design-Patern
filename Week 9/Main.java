package edu.hus.sc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IStore store = new Store();
        IListOrder orderList = new ListOrder();
        Order oder = new Order();
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("1. Add a new product to the Store.");
            System.out.println("2. Update price for a particular product");
            System.out.println("3. A list of all available products in the Store");
            System.out.println("4. Create a new Order");
            System.out.println("5. Printf information of an Order by OrderID");
            System.out.println("6. Sort all products by product price as ascending");
            System.out.println("7. Print information of all Orders by a specific customer ID");
            System.out.println("8. Print information of all Orders");
            System.out.println("9. Exit");
            System.out.print("Seclect your choice: ");
            int choice = Integer.parseInt(in.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = in.nextLine();
                    System.out.print("Enter price: ");
                    double price = Double.parseDouble(in.nextLine());
                    store.addProduct(new Product(store.generateProductID(), name, price));
                    break;
                case 2:
                    System.out.print("Enter product id: ");
                    String id = in.nextLine();
                    if (!store.checkProductId(id)) {
                        System.out.print("Enter new price: ");
                        double newPrice = Double.parseDouble(in.nextLine());
                        store.updatePrice(id, newPrice);
                    } else {
                        System.out.println("Not found id!!!");
                    }
                    break;
                case 3:
                    store.print();
                    break;
                case 4:
                    orderList.addOrder((Store) store);
                    break;
                case 5:
                    System.out.print("Enter customer Id: ");
                    String orderId = in.nextLine();
                    if (!orderList.checkOrderId(orderId)) {
                        orderList.printByOrderId((Store) store, orderId);
                    } else {
                        System.out.println("Not found order id!!!");
                    }
                    break;
                case 6:
                    store.sortByPrice();
                    store.print();
                    break;
                case 7:
                    System.out.print("Enter customer Id: ");
                    String customerId = in.nextLine();
                    if (!orderList.checkOrderCustomerId(customerId)) {
                        orderList.printByCustomerId((Store) store, customerId);
                    } else {
                        System.out.println("Not found customer id!!!");
                    }
                    break;
                case 8:
                    orderList.print();
                    break;
                case 9:
                    return;
            }
        } while (true);
    }
}
