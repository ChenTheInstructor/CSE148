package p1_predicate;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
	private String name;
	private double gpa;
	private String id;

	private static int idCount = 0;

	public Student(Student student) {
		this.name = student.name;
		this.gpa = student.gpa;
		id = String.valueOf(idCount++);
	}

	@Override
	public int hashCode() {
		return Objects.hash(gpa, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Double.doubleToLongBits(gpa) == Double.doubleToLongBits(other.gpa) && Objects.equals(name, other.name);
	}

	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
		id = String.valueOf(idCount++);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + ", id=" + id + "]";
	}
	
	public static int getIdCount() {
		return idCount;
	}
	
	public static void setIdCount(int idCount) {
		Student.idCount = idCount;
	}

}
