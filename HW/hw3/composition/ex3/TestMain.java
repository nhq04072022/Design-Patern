package hw3.composition.ex3;

public class TestMain {
    public static void main() {
        // Test Author class
        Author author1 = new Author("Tan Ah Teck", "ahteck@nowwhere.com");
        System.out.println(author1);

        author1.setEmail("ahteck@somewhere.com");
        System.out.println(author1);
        System.out.println("name is: " + author1.getName());
        System.out.println("email is: " + author1.getEmail());

        // Test Book class
        Book book1 = new Book("12345", "Java for dummies", author1, 8.8, 88);
        System.out.println(book1);

        book1.setPrice(9.9);
        book1.setQty(99);
        System.out.println(book1);
        System.out.println("isbn is: " + book1.getIsbn());
        System.out.println("name is: " + book1.getName());
        System.out.println("price is: " + book1.getPrice());
        System.out.println("qty is: " + book1.getQty());
        System.out.println("Author is: " + book1.getAuthor()); // Author's toString()
        System.out.println("Author's name is: " + book1.getAuthor().getName());
        System.out.println("Author's email is: " + book1.getAuthor().getEmail());
    }
}
