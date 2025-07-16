package hw3.composition.ex1;

public class Book {
    private String name;
    private Author authors;
    private double price;
    private int qty;

    public Book(String name, Author authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        qty = 0;
    }

    public Book(String name, Author authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book [name = " + name + ", Author[name = " + authors.getName() + ", email = " + authors.getEmail()
                + "gender = " + authors.getGender() + "], price=" + price + ", qty=" + qty + "]";
    }

    public String getAuthorName() {
        return authors.getName();
        // can't use authors.name as name is private in Author class
    }

    public String getAuthorEmail() {
        return authors.getEmail();
        // can't use authors.email as name is private in Author class
    }

    public char getAuthorGender() {
        return authors.getGender();
        // can't use authors.gender as name is private in Author class
    }
}
