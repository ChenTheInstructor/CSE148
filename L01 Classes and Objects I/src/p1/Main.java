package p1;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setName("Dan");
		s1.setGpa(4.0);
		s1.setAge(26);
		
		String s1Name = s1.getName();
		double s1Gpa = s1.getGpa();
		int s1Age = s1.getAge();
		
		System.out.println(s1Name);
		System.out.println(s1Gpa);
		System.out.println(s1Age);
		
		System.out.println("\nAnother student: ");
		Student s2 = new Student();
		
		s2.setName("Jeter");
		s2.setGpa(4.0);
		s2.setAge(18);
		
		String s2Name = s2.getName();
		double s2Gpa = s2.getGpa();
		int s2Age = s2.getAge();
		
		System.out.println(s2Name);
		System.out.println(s2Gpa);
		System.out.println(s2Age);
	}

}
