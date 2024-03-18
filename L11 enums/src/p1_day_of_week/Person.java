package p1_day_of_week;

public class Person {

	private String name;
	private DayOfWeek birthday;

	public Person(String name, DayOfWeek birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DayOfWeek getBirthday() {
		return birthday;
	}

	public void setBirthday(DayOfWeek birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthday=" + birthday + "]";
	}

}
