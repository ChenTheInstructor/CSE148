package p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// two things can happen to interrupt the flow of a program
		// Error: one cannot handle an error
		// Exception: one can handle an exception
		// a: unchecked exceptions, not checked by the compiler. Runtime exception
		// b: checked exceptions, checked by the compiler
//		int[] arr = {1, 3, 6, 9};
//		
//		try {
//			System.out.println(arr[4]);
//		} catch (Exception e) {
////			e.printStackTrace();
//		}

//		File file = new File("data.txt");
//		Scanner scanner = new Scanner(file);
//		try {
//		int result = 10 / 0;
//		} catch(ArithmeticException e) {
//			System.out.println("Cannot divide by zero");
//		}

		Scanner scanner = new Scanner(System.in);

		int n;
		do {
			try {
				System.out.println("Enter an integer: ");
				n = scanner.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Caught illegalArgumentException");
				scanner.nextLine();
				System.out.println("The input value is not an integer");
			} catch (RuntimeException e) {
				scanner.nextLine();
				System.out.println("Caught runtime exception!");
			} catch(Exception e) {
				scanner.nextLine();
				System.out.println("Caught exception!");
			}
		} while (true);
		System.out.println(n);
		System.out.println("End of program");
	}

}
