package p2_comparisons;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Jose", 3.5);
		Student s2 = new Student("Jose", 3.5);
		
		System.out.println(s1.compareTo(s2));
	}

}
