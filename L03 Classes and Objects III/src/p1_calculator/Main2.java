package p1_calculator;

public class Main2 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator(5.0, 10.0);
		Calculator c3 = c1;
		System.out.println(c1);
		System.out.println(c1.getN1());
		System.out.println(c2);
		System.out.println(Calculator.getCount());
		System.out.println(Math.random());
		System.out.println(Math.sqrt(4));
	}

}
