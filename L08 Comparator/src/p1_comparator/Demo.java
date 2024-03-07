package p1_comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("M", 0.5, 10);
		Student s2 = new Student("Z", 2.5, 20);
		Student s3 = new Student("C", 1.5, 15);

		Student[] arr1 = { s1, s2, s3 };
//		Arrays.sort(arr1, new MyComparator()); // sort the array
		
//		Arrays.sort(arr1, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return Integer.compare(o1.getAge(), o2.getAge());
//			}
//			
//		});
		
		Comparator<Student> comparatorByName = (o1, o2) -> o1.getName().compareTo(o2.getName());
		Comparator<Student> comparatorByGPA = (o1, o2) -> Double.compare(o1.getGpa(), o2.getGpa());
		Comparator<Student> comparatorByAge = (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge());
		
		Arrays.sort(arr1, comparatorByAge);
		
		System.out.println(Arrays.toString(arr1));

	}

}
