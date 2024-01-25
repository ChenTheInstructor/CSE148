package p2;

public class Course {
	private String title;
	private double credits;
	private int numStudents;

	public Course(String title, double credits, int numStudents) {
		this.title = title;
		this.credits = credits;
		this.numStudents = numStudents;
	}

	public Course() {
//		super();
	}

	public Course(String title, double credits) {
		super();
		this.title = title;
		this.credits = credits;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	@Override
	public String toString() {
		return "Course [title=" + title + ", credits=" + credits + ", numStudents=" + numStudents + "]";
	}
	
	

}
