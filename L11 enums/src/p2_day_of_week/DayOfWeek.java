package p2_day_of_week;

public enum DayOfWeek {
	MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), 
	SATURDAY(6), SUNDAY(7);
	
	private int value;
	
	DayOfWeek(int n) {
		value = n;
	}
	
	public void setValue(int n) {
		this.value = n;
	}
	
	public int getValue() {
		return value;
	}
}
