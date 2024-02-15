package p1;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("John", "J", "Doe", 3.5);
		Student s2 = new Student("Jane", "D", "Doe", 1.5);
		Student s3 = new Student("Joe", "J", "Smith", 4.0);
		
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		College sccc = new College("SCCC", new Address("533", "College Road", "Selden", "NY", "11784"), 100, 10000);
		sccc.getStudentBag().insert(s1);
		sccc.getStudentBag().insert(s2);
		sccc.getStudentBag().insert(s3);
		
		Student studentRemoved = sccc.getStudentBag().removeById("2");
//		System.out.println(studentRemoved);
		sccc.getStudentBag().display();
		
	}

}
