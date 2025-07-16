package hw3.composition.ex2;

public class TestBook {
	public static void main() {
		// Construct an author instance
		Author[] authors = new Author[2];
		authors[0] = new Author("Paul Tan", "paul@somewhere.com", 'm');
		authors[1] = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
		System.out.println(authors[1]); // Author's toString()

		Book javaBook = new Book("Java for Dummy", authors, 19.99, 99); // Test Book's Constructor
		System.out.println(javaBook); // Test Book's toString()

		// Test Getters and Setters
		javaBook.setPrice(29.95);
		javaBook.setQty(28);
		System.out.println("name is: " + javaBook.getName());
		System.out.println("price is: " + javaBook.getPrice());
		System.out.println("qty is: " + javaBook.getQty());
		// Use an anonymous instance of Author to construct a Book instance

		System.out.println("Name of author from Book instance: " + javaBook.getAuthorNames());
	}
}
