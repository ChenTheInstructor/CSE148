package p2_text_file_io;

public class StudentBag {
	private Student[] arr;
	private int nElems;
	
	public StudentBag(int maxSize) {
		arr = new Student[maxSize];
	}

	public void insert(Student s) {
		arr[nElems++] = s;
	}

	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
}
