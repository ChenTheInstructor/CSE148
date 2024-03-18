package p1_day_of_week;

public class Demo {

	public static void main(String[] args) {
//		Person p1 = new Person("Joe", DayOfWeek.WEDNESDAY);
//		p1.setBirthday(DayOfWeek.FRIDAY);
//		System.out.println(p1);
		
		DayOfWeek birthday = DayOfWeek.MONDAY;
		
		switch(birthday) {
		case DayOfWeek.MONDAY: 
			System.out.println("Your birthday is Monday.");
//			break; // fall through
		case DayOfWeek.TUESDAY: 
			System.out.println("Your birthday is Tuesday.");
//			break;
		case DayOfWeek.WEDNESDAY: 
			System.out.println("Your birthday is Wednesday.");
//			break;
		case DayOfWeek.THURSDAY: 
			System.out.println("Your birthday is Thursday.");
//			break;
		case DayOfWeek.FRIDAY: 
			System.out.println("Your birthday is Friday.");
//			break;
		case DayOfWeek.SATURDAY: 
			System.out.println("Your birthday is Saturday.");
//			break;
		case DayOfWeek.SUNDAY: 
			System.out.println("Your birthday is Sunday.");
//			break;
		default:
			System.out.println("No such day of the week.");
		}
		
	}

}
