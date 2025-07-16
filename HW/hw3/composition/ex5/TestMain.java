package hw3.composition.ex5;

public class TestMain {
    public static void main() {
        // Test constructor and toString()
        Customer customer1 = new Customer(88, "Thuy", 'm');
        Account account1 = new Account(22, customer1, 1000000);
        Account account2 = new Account(171, new Customer(201, "Chip", 'm'));
        System.out.println(account1 + "\n" + account2);

        // Test getter
        System.out.println("id of account1: " + account1.getId());
        System.out.println("customer of account2: " + account2.getCustomer());
        System.out.println("customer name of account1: " + account1.getCustomerName());
        System.out.println("account2 withdraw $10: ");
        account2.withdraw(10);
        System.out.println("account1 give account2 $500000");
        account1.setBalance(500000);
        account2.deposit(500000);
        System.out.println("account2 withdraw $10: ");
        account2.withdraw(10);
        System.out.println(account1 + "\n" + account2);
    }
}
