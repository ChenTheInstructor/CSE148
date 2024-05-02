package p2;

import java.util.List;

public class Bookstore {

	public static void main(String[] args) {
		Book book1 = new Book("AAA", "Author 1", 40.00);
		Book book2 = new Book("BBB", "Author 2", 60.00);
		Book book3 = new Book("CCC", "Author 3", 20.00);
		
		Customer customer = new Customer("John Doe", "JDoe@gmail.com");
		
		Order order = new Order(customer, List.of(book1, book2, book3));
		
		printOrderInformation(order);
	}
	
	public static void printOrderInformation(Order order) {
		System.out.println("Order Details: ");
		System.out.println("Customer: " + order.custome().name + " - " + order.custome().email() );
		System.out.println("Books ordered: ");
		for(Book book : order.books()) {
			System.out.println(book.title() + " by " + book.author() + " - $" + book.price());
		}
	}
	
	public record Book(String title, String author, double price) {}
	public record Customer(String name, String email) {}
	public record Order(Customer custome, List<Book> books) {}
}
