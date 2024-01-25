package p2;

public class Main {

	public static void main(String[] args) {
		Course c1 = new Course();
		Course c2 = new Course("OOP", 4.0, 25);
		Course c3 = new Course("OOP", 4.0);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
