package p1;

public class Demo {
	/*
	 * Ways to use an interface
	 * 1. Create a concrete class which implements the interface
	 * 2. Create an anonymous class which implements the interface
	 * 3. Use Lambda Expression to implement a functional interface
	 *  A functional interface is an interface with only ONE abstract method
	 */ 

	public static void main(String[] args) {
		Computable c1; // allowed to declare a data type
//		c1 = new Computable();// not allowed to create object, same as an abstract class
		Computable calc1 = new Calculator();
		calc1.printBye(); // using default method
		Computable.printHello(); // using the static method
		System.out.println(calc1.add(1.5, 2.5));
		System.out.println(calc1.subtract(1.5, 2.5));
		System.out.println(Computable.PI);
//		Computable.PI = 3.1; not allowed because it is always public static final
	}

}
