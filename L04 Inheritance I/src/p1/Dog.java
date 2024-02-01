package p1;

public class Dog {
	private String name;
	private int age;
	private double weight;
	private String breed;
	private String id;
	
	private static int idCount = 0;
	
	public Dog() {
		idCount++;
		id = String.valueOf(idCount);
	}
	
	public Dog(String name, int age, double weight, String breed) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.breed = breed;
		idCount++;
		id = String.valueOf(idCount);
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + ", breed=" + breed + ", id=" + id + "]";
	}

//	public void setId(String id) {
//		this.id = id;
//	}

//	public static int getIdCount() {
//		return idCount;
//	}
//
//	public static void setIdCount(int idCount) {
//		Dog.idCount = idCount;
//	}
	
	
}
