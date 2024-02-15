package p1;

public class Student {
	private Name name;
	private String id;
	private double gpa;

	private static int idCount = 0;

	public Student(Name name, double gpa) {
		this.name = name;
		this.gpa = gpa;
		id = String.valueOf(++idCount);
	}

	public Student(String firstName, String middleInitial, String lastName, double gpa) {
		this.name = new Name(firstName, middleInitial, lastName);
		this.gpa = gpa;
		id = String.valueOf(++idCount);
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", gpa=" + gpa + "]";
	}

}
