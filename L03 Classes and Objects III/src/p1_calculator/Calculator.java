package p1_calculator;

public class Calculator {
	private double n1;
	private double n2;

	private static int count = 0;

	// Overloaded constructors
	public Calculator() { // no-arg constructor
		count++;
	}

	public Calculator(double x, double y) {
		n1 = x;
		n2 = y;
		count++;
	}
	
	public Calculator(int x, int y) {
		n1 = x;
		n2 = y;
		count++;
	}

	public Calculator(double x) {
		n1 = x;
		n2 = 100;
		count++;
	}

	// static methods, which belong to the class
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Calculator.count = count;
	}

	// instance methods, which belong to individual objects
	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	// Overloaded methods
	public double add(double n1, double n2) {
		return n1 + n2;
	}
	
	public int add(int n1, int n2) {
		return n1 + n2;
	}
	

	@Override
	public String toString() {
		return "Calculator [n1=" + n1 + ", n2=" + n2 + "]";
	}

}
