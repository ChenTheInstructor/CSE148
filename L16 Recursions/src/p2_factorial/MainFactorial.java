package p2_factorial;

public class MainFactorial {

	public static void main(String[] args) {
		System.out.println(factorial(17));
	}

	private static int factorial(int n) {
		if(n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
