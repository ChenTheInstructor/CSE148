package exam1;

public class Demo {

	public static void main(String[] args) {
		Item book1 = new Book("Java Book", "Random House", "JavaBookISBN");
		Item book2 = new Book("HTML Book", "Publisher Bill", "HTMLBookISBN");

		Item cd1 = new MusicCD("Popular Songs", "Song Publisher 1", "Artist 1", "Jazz");
		Item cd2 = new MusicCD("Unpopular Songs", "Song Publisher 2", "Artist 2", "Anything but Jazz");

		Library library = new Library(1000);
		library.add(book1);
		library.add(book2);
		library.add(cd1);
		library.add(cd2);

		System.out.println(library.removeByCallNumber("1"));
		System.out.println("After removal: ");
		library.displayLibrary();

	}

}
