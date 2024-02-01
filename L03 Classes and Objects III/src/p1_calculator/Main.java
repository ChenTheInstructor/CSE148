package p1_calculator;

public class Main {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();
		Calculator c3 = c1; // shallow copy of c1 stored in c3
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		System.out.println(c1 == c2);// == always comparing memory addresses
		System.out.println(c1 == c3);
		
		c1 = null;
		c2 = null;
	}

}
