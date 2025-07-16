package hw3.composition.ex1;

public class TestBook {
    public static void main() {
        // Test constructor
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck); // Author's toString()

        // Test Book's Constructor
        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);

        // Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthors()); // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthors().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthors().getEmail());

        // Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook); // toString()
    }
}
