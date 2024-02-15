package p2_abstract;

public class Instructor extends Person {
	private double salary;

	public Instructor(String name, String id, double salary) {
		super(name, id);
		this.salary = salary;
	}

	@Override
	public void greetings() {
		System.out.println("Hello from an instructor...");
	}

}
