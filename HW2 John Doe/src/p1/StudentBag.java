package p1;

public class StudentBag {
	private Student[] students;
	private int nElems;
	
	public StudentBag(int maxSize) {
		students = new Student[maxSize];
		nElems = 0;
	}
	
	public void insert(Student student) {
		students[nElems++] = student;
	}
	
	public void insert(String firstName, String middleInitial, String lastName, double gpa) {
		students[nElems++] = new Student(firstName, middleInitial, lastName, gpa);
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(students[i]);
		}
		System.out.println();
	}
	
	public Student searchById(String id) {
		for(int i =0; i < nElems; i++) {
			if(students[i].getId().equals(id)) {
				return students[i];
			}
		}
		return null;
	}
	
	public Student removeById(String id) {
		int i;
		for(i = 0; i < nElems; i++) {
			if(students[i].getId().equals(id)) {
				break;
			}
		}
		
		if(i == nElems) {
			return null;
		} else {
			Student temp = students[i];
			for(int j = i; j < nElems - 1; j++) {
				students[j] = students[j + 1];
			}
			nElems--;
			return temp;
		}
	}
}
