package p1;

import java.util.ArrayList;
public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(mySupplier());
		list.add(mySupplier());
		list.add(mySupplier());
		list.add(myFunction(10));
		
		list.forEach(n -> System.out.print(n + " "));
		System.out.println();
		list.forEach(n -> {
			System.out.print(n * 2 + ", ");
			System.out.println(n * 3);
		});
		
//		
//		System.out.println();
//		list.forEach(Demo::myPrint);// method reference
	}
	
	

	private static void myPrint(int n) {
		System.out.print(n * n + " ");
	}
	
	private static int mySupplier() {
		return (int)(Math.random() * 100);
	}
	
	public static Integer myFunction(Integer n) {
		return n * 2;
	}
	
	public static Double myBiFunction(Integer n, Double d) {
		return n * d;
	}
}
