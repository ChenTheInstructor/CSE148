package p2_custom_Exceptions;

public class Demo {

	public static void main(String[] args) {
		try {
			Student s1 = new Student("A", 110);
		} catch (IllegalScoreException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
//			System.out.println("The score is illegal.");
		}
		
		System.out.println("The end");
	}

}
