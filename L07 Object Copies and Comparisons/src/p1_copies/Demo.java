package p1_copies;

public class Demo {

	public static void main(String[] args) {
//		Student s1 = new Student("John", 2.5);
//		s1.setName("Joey");
//		Student s2 = s1; // shallow copy
////		System.out.println(s1.getName());
//		System.out.println(s1.equals(s2)); // == or .equals()
//		Student s3 = new Student("Joey", 2.5);
//		s3.setName("Jose");
//		System.out.println(s1.getName());
//		System.out.println(s3.getName());
//		System.out.println(s1.equals(s3));
		
//		String name = "John";
//		String name2 = new String("John");
//		System.out.println(name == name2);
		
		Student s1 = new Student("John", 3.5);
//		Student s2 = new Student(new String(s1.getName()), s1.getGpa()); // deep copy of s1
		Student s2 = new Student(s1); // make a deep copy of s1
		System.out.println(s1 == s2);
//		s2.setName("Joey");
		System.out.println(s1.getName());
		
		System.out.println(s1.equals(s2));
		
		System.out.println();
	}

}
