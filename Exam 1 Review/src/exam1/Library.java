package exam1;

public class Library {
	private Item[] arr;
	private int nElems;
	
	public Library(int maxSize) {
		arr = new Item[maxSize];
		nElems = 0;
	}
	
	public Item removeByISBN(String isbn) {
		int i;
		for(i = 0; i < nElems; i++) {
			if(arr[i] instanceof Book && ((Book)arr[i]).getIsbn().equals(isbn)) {
				break;
			}
		}
		
		if(i == nElems) {
			return null;
		} else {
			Item temp = arr[i];
			for(int j = i; j < nElems - 1; j++) {
				arr[j] = arr[j + 1];
			}
			nElems--;
			return temp;
		}
	}
	
	public Item removeByCallNumber(String callNumber) {
		int i;
		for(i = 0; i < nElems; i++) {
			if(arr[i].getCallNumber().equals(callNumber)) {
				break;
			}
		}
		
		if(i == nElems) {
			return null;
		} else {
			Item temp = arr[i];
			for(int j = i; j < nElems - 1; j++) {
				arr[j] = arr[j + 1];
			}
			nElems--;
			return temp;
		}
	}
	
	public MusicCD searchByArtist(String artist) {
		for(int i = 0; i < nElems; i++) {
			if(arr[i] instanceof MusicCD && ((MusicCD)arr[i]).getArtist().equals(artist)) {
				return (MusicCD)arr[i];
			}
		}
		
		return null;
	}
	
	public void add(Item item) {
		arr[nElems++] = item;
	}
	
	public void displayMusicCDs() {
		System.out.println("Music CDs in the library: ");
		for(int i = 0; i < nElems; i++) {
			if(arr[i].getClass() == MusicCD.class) {
				System.out.println(arr[i]);
			}
		}
		System.out.println();
	}
	
	
	public void displayBooks() {
		System.out.println("Books in the library: ");
		for(int i = 0; i < nElems; i++) {
			if(arr[i] instanceof Book) {
				System.out.println(arr[i]);
			}
		}
		System.out.println();
	}
	
	public void displayLibrary() {
		System.out.println("All items in the library: ");
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
	}
}
