package p1;

public class Student extends Person {
	private final String ID;

	public Student(String name, double gpa, String id) {
		super(name, gpa);
		this.ID = id;
	}

	public String getId() {
		return ID;
	}

//	public void setId(String id) {
//		this.id = id;
//	}
	
	

}
