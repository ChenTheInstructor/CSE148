package p1;

public class College {
	private String name;
	private Address address;
	private BookBag bookBag;
	private StudentBag studentBag;

	public College(String name, Address address, int maxBookBagSize, int maxStudentsSize) {
		this.name = name;
		this.address = address;
		bookBag = new BookBag(maxBookBagSize);
		studentBag = new StudentBag(maxStudentsSize);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public BookBag getBookBag() {
		return bookBag;
	}

	public void setBookBag(BookBag bookBag) {
		this.bookBag = bookBag;
	}

	public StudentBag getStudentBag() {
		return studentBag;
	}

	public void setStudentBag(StudentBag studentBag) {
		this.studentBag = studentBag;
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", address=" + address + ", bookBag=" + bookBag + ", studentBag=" + studentBag
				+ "]";
	}

}
