package p1_predicate;

import java.util.Arrays;
import java.util.function.Predicate;

public class StudentBag {
	private Student[] arr;
	private int nElems;
	
	public StudentBag(int maxSize) {
		arr = new Student[maxSize];
	}
	
	public Student[] remove(Predicate<Student> predicate) {
		Student[] foundArr = new Student[nElems];
		int count = 0;
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				foundArr[count++] = arr[i];
				for(int j = i; j < nElems - 1; j++) {
					arr[j] = arr[j + 1];
				}
				nElems--;
				i--;
			}
		}
		return Arrays.copyOf(foundArr, count);
	}
	
	public Student[] search(Predicate<Student> predicate) {
		Student[] foundArr = new Student[nElems];
		int count = 0;
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				foundArr[count++] = arr[i];
			}
		}
		return Arrays.copyOf(foundArr, count);
	}
	
//	public Student[] searchByName(String name) {
//		Student[] foundArr = new Student[nElems];
//		int count = 0;
//		for(int i = 0; i < nElems; i++) {
//			if(arr[i].getName().equals(name)) {
//				foundArr[count++] = arr[i];
//			}
//		}
//		return Arrays.copyOf(foundArr, count);
//	}
//	
//	public Student[] searchByGPAAbove(double gpa) {
//		Student[] foundArr = new Student[nElems];
//		int count = 0;
//		for(int i = 0; i < nElems; i++) {
//			if(arr[i].getGpa() >= gpa) {
//				foundArr[count++] = arr[i];
//			}
//		}
//		return Arrays.copyOf(foundArr, count);
//	}
//	
//	public Student[] searchByGPAExact(double gpa) {
//		Student[] foundArr = new Student[nElems];
//		int count = 0;
//		for(int i = 0; i < nElems; i++) {
//			if(arr[i].getGpa() == gpa) {
//				foundArr[count++] = arr[i];
//			}
//		}
//		return Arrays.copyOf(foundArr, count);
//	}
	
	public void insert(Student student) {
		arr[nElems++] = student;
	}
	
	public void insert(String name, double gpa) {
		Student s = new Student(name, gpa);
		arr[nElems++] = s;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
	}
}
