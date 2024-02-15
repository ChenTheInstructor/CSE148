package p1;

public class Name {
	private String firstName;
	private String middleInitial;
	private String lastName;

	public Name() {
	}

	public Name(String firstName, String middleInitial, String lastName) {
		this.firstName = firstName;
		this.middleInitial = middleInitial.substring(0, 1);
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial.substring(0, 1);
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", middleInitial=" + middleInitial + ", lastName=" + lastName + "]";
	}

}
