package p5_functional_interface;

public class Demo {

	public static void main(String[] args) {
//		Computable c1 = new Computable() {
//
//			@Override
//			public double compute(double x, double y) {
//				return x * y;
//			}
//			
//		};

		// use lambda expression
		Computable add = (x, y) -> x + y;
		Computable subtract = (x, y) -> x - y;
		Computable multiply = (x, y) -> x * y;
		Computable divide = (x, y) -> x / y;

		System.out.println(add.compute(1.5, 1.0));
		System.out.println(subtract.compute(1.5, 1.0));
		System.out.println(multiply.compute(1.5, 1.0));
		System.out.println(divide.compute(1.5, 1.0));

		divide = (x, y) -> {
			if (y != 0.0) {
				return x / y;
			}
			System.out.println("Cannot divide");
			return 0.0000001;
		};
		
		System.out.println(divide.compute(1.5, 0.0));
	}
}
