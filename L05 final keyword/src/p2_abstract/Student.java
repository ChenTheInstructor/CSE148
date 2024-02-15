package p2_abstract;

public class Student extends Person {
	private double gpa;

	public Student(String name, String id, double gpa) {
		super(name, id);
		this.gpa = gpa;
	}

	@Override
	public void greetings() {
		System.out.println("Hello from a student...");
	}

	
	
}
