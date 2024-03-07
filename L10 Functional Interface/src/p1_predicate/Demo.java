package p1_predicate;

import java.util.Arrays;
import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("A", 1.0);
		Student s2 = new Student("B", 2.0);
		Student s3 = new Student("C", 4.0);
		Student s4 = new Student("A", 0.0);
		
		StudentBag bag = new StudentBag(100);
		bag.insert(s1);
		bag.insert(s2);
		bag.insert(s3);
		bag.insert(s4);
		bag.display();
		
//		Student[] arr = bag.search(new Predicate<Student>() {
//
//			@Override
//			public boolean test(Student t) {
//				return t.getGpa() == 4.0;
//			}
//			
//		});
		
//		Student[] arr = bag.search(t -> t.getName().equals("C") || t.getGpa() >= 2.0);
		
		Student[] arr = bag.remove(t -> t.getGpa() <= 3.0);
		System.out.println("\nMatches found: ");
		System.out.println(Arrays.toString(arr));
		bag.display();
	}

}
