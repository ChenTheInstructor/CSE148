package p1;

public class BookBag {
	private Book[] books;
	private int nElems;
	
	public BookBag(int maxSize) {
		books = new Book[maxSize];
	}
}
