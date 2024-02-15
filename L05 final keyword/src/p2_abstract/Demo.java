package p2_abstract;

public class Demo {

	public static void main(String[] args) {
		Person s1 = new Student("John", "123", 3.5);
		s1.greetings();
		
		Person instructor1 = new Instructor ("Jane", "456", 1000);
		instructor1.greetings();
		
		Person[] arr = {s1, instructor1};
		System.out.println(s1 instanceof Person);
		System.out.println(s1 instanceof Student);
		System.out.println(s1 instanceof Instructor);
	}
// polymorphism
}
