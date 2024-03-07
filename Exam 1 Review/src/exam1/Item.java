package exam1;

public abstract class Item {
	private String title;
	private String publisher;
	private String callNumber;

	private static int callNumberID = 0;

	public Item(String title, String publisher) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.callNumber = String.valueOf(++callNumberID);
	}

	public Item() {
		super();
		this.callNumber = String.valueOf(++callNumberID);
	}

	public Item(String title) {
		super();
		this.title = title;
		this.callNumber = String.valueOf(++callNumberID);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCallNumber() {
		return callNumber;
	}

	@Override
	public String toString() {
		return "[title=" + title + ", publisher=" + publisher + ", callNumber=" + callNumber + "]";
	}

}
