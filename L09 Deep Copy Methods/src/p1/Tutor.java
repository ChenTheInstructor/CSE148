package p1;

import java.util.Objects;

public class Tutor {
	private Student student;
	private int hoursWorked;

	public Tutor(String name, double gpa, int hoursWorked) {
		this.student = new Student(name, gpa); // shallow copy
		this.hoursWorked = hoursWorked;
	}
	
	public Tutor(Student student) { // deep copy constructor
		this.student = new Student(student);
	}

	public Student getStudent() {
		return student;
	}
	
	public Student getStudentDeep() {
		return new Student(student);
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(hoursWorked, student);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tutor other = (Tutor) obj;
		return hoursWorked == other.hoursWorked && Objects.equals(student, other.student);
	}

	@Override
	public String toString() {
		return "Tutor [student=" + student + ", hoursWorked=" + hoursWorked + "]";
	}

}
