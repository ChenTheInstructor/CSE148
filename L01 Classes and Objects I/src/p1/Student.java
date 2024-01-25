package p1;

public class Student {
	private String name = "John";
	private double gpa = 0.0;
	private int age = 18;

	private static String collegeName;

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

	public int getAge() {
		return age;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setGpa(double newGpa) {
		gpa = newGpa;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void doHomework() {
		System.out.println("Do homework...");
	}

	public String submitHomework(String hw) {
		return hw;
	}
}
