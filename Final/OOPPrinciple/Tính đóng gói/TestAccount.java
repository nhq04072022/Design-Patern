package exam1;

public class TestAccount {
	public static void main(String[] args) {
		Account a1 = new Account("001", "No Name");
		System.out.println(a1);
		
		Account a2 = new Account("002", "Account 2", 1000000);
		System.out.println(a2);
		
		a2.transferTo(a1, 1500000);
		a2.transferTo(a1, 500000);
		System.out.println(a1 + "\n" + a2);
	}
}
