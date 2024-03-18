package p1_day_of_week;

public class Demo2 {

	public static void main(String[] args) {

		int num = 3;

		String day = switch (num) {
		case 1, 2, 3, 4, 5 -> "Weekday";

		case 6, 7 -> "Weekend";

		default -> {
			System.out.println("No such day.");
			yield "null";
		}
		};

		System.out.println("The day is: " + day);

//		switch (num) {
//		case 1, 2, 3, 4, 5:
//			day = "weekday";
//			break;
//		case 6, 7:
//			day = "weekend";
//			break;
//		default:
//			System.out.println("No such day.");
//		}
//		
//		System.out.println("The day is: " + day);
	}

}
