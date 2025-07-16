package hw3.composition.ex2;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty;

	public Book(String name, Author authors[], double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		qty = 0;
	}

	public Book(String name, Author authors[], double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthors() {
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

	public String getAuthorNames() {
		String s = authors[0].getName();
		for (int i = 1; i < authors.length; i++)
			s += "," + authors[i].getName();
		return s;
	}

	public String toString() {
		String s = "Book[name= " + name + ", authors = {Author[name = " + authors[0].getName() + ", email = "
				+ authors[0].getEmail() + ", gender = " + authors[0].getGender() + "]";

		for (int i = 1; i < authors.length; i++)
			s += ",Author[name= " + authors[i].getName() + ", email = " + authors[i].getEmail() + ", gender = "
					+ authors[i].getGender() + "]";

		s += "},price= " + price + ",qty=" + qty + "]";
		return s;
	}
}
