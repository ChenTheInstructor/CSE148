package p2;

public class Cat extends Pet{
	private String color;

	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	
	public Cat() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void speak() {
		System.out.println("The cat is speaking...");
	}

	@Override
	public String toString() {
		return "Cat [" + super.toString() + ", color=" + color + "]";
	}
	
	
}
