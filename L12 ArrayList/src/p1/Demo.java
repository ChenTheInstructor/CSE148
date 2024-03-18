package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
//		String[] arr = new String[100];
//		int[] arr2 = new int[100];
		
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("A");
		list1.add("A");
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("John");
		
		
		list2.add("John");
		list2.addAll(list1);
		
		list2.add(0, "Adam");
		list2.set(0, "Jose");
		
		list2.forEach((s) -> System.out.print(s + " "));
		System.out.println();
		System.out.println(list2.contains("Adam"));
		System.out.println(list2.get(5));
		System.out.println(list2.containsAll(list1));
		System.out.println(list2.indexOf("Jane"));
		list2.remove("John");
		for(String str : list2) {
			System.out.print(str + " ");
		}
		
//		list2.sort((s1, s2) -> s1.compareTo(s2));
		list2.forEach(System.out::println); // method reference
		Collections.sort(list2);
//		list2.forEach(System.out::println); // method reference
		List<String> list3 = (List<String>) list2.reversed();
		list3.forEach(System.out::println); // method reference
		
		System.out.println(list3);
	}

}
