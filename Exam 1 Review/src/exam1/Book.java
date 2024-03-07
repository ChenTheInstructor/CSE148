package exam1;

public class Book extends Item {
	private String isbn;

	public Book(String title, String publisher, String isbn) {
		super(title, publisher);
		this.isbn = isbn;
	}

	public Book(String title, String publisher) {
		super(title, publisher);
	}

	public Book(String title) {
		super(title);
	}
	
	public Book() {
		super();
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [" + getTitle() + ", " + getPublisher() + ", "
				+ getCallNumber() + ", " + isbn + "]";
	}
	
	
}
