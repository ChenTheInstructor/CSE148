package p2;

public class Dog extends Pet {
	private double weight;
	private String breed;
	
	public Dog(String name, int age, double weight, String breed) {
		super(name, age);
		this.weight = weight;
		this.breed = breed;
	}
	
	public Dog() {
		super();
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
	
	public void speak() {
		System.out.println("The dog is speaking...");
	}

	@Override
	public String toString() {
		return "Dog [" + super.toString() + ", weight=" + weight + ", breed=" + breed + "]";
	}
	
	
}
