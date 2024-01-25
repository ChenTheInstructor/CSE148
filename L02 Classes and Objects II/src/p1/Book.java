package p1;

public class Book {
	private String title;
	private String author;
	private double price;
	
	private static String publisher;
	
	public Book() {
		title = "Java";
		author = "John Doe";
		price = 9.99;
	}
	
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return title + ":\t" + author + "\t$" + price;
	}
}
