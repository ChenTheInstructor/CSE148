package p1;

public class Student {
	String name;
	double gpa;
	int age;
	
	String getName() {
		return name;
	}
	
	double getGpa() {
		return gpa;
	}
	
	int getAge() {
		return age;
	}
	
	void setName(String newName) {
		name = newName;
	}
	
	void setGpa(double newGpa) {
		gpa = newGpa;
	}
	
	void setAge(int newAge) {
		age = newAge;
	}
	
	void doHomework() {
		System.out.println("Do homework...");
	}
	
	String submitHomework(String hw) {
		return hw;
	}
}
