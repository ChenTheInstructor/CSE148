package p1;

public class Demo {

	public static void main(String[] args) {
		Tutor t1 = new Tutor("John", 4.0, 20);
		Tutor t2 = t1;
		t1.getStudentDeep().setName("Jane");
//		System.out.println(t1 == t2);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1.equals(t2));
		
//		Student s1 = new Student("John", 4.0);
//		Tutor t1 = new Tutor(s1, 20);
//		System.out.println(t1);
//		
//		s1.setName("Jane");
//		s1.setGpa(0.5);
//		
//		System.out.println(t1);
		
//		Tutor t2 = new Tutor(s1);
//		t2.setHoursWorked(10);
//		
//		System.out.println(t2);
		
//		s1.setName("Jane");
//		s1.setGpa(0.0);
//		System.out.println(t2);
		
		Student studentTutor = t2.getStudentDeep(); // deep copy
//		studentTutor.setName("Joey");
//		studentTutor.setGpa(1.5);
//		
//		System.out.println(t2);
//		
//		System.out.println(studentTutor.equals(s1));
	}

}
