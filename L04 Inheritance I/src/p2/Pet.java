package p2;

public class Pet {
	private String name;
	private int age;
	private String id;
	private static int idCount;

	public Pet() {
		id = String.valueOf(++idCount);
	}

	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
		id = String.valueOf(++idCount);
	}
	
	public void speak() {
		System.out.println("The pet is speaking...");
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

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

}
