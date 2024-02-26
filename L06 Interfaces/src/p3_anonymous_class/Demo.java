package p3_anonymous_class;

public class Demo {

	public static void main(String[] args) {
		Computable c1 = new Computable() {

			@Override
			public double add(double n1, double n2) {
				return n1 + n2;
			}

			@Override
			public double subtract(double n1, double n2) {
				return n1 - n2;
			}
			
		};
		
		System.out.println(c1.add(1.5, 2.5));
		System.out.println(c1.subtract(1.5, 2.5));
		c1.printBye();
		Computable.printHello();
	}

}
