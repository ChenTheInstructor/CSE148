package p1;

public class Cat {
	private String name;
	private int age;
	private String color;
	private String id;
	
	private static int idCount;
	
	public Cat() {
		id = String.valueOf(++idCount);
	}
	
	public Cat(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.id = String.valueOf(++idCount);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", color=" + color + ", id=" + id + "]";
	}
	
	
}
