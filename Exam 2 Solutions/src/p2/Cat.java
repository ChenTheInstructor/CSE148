package p2;

import java.io.Serializable;
import java.util.Objects;

public class Cat extends Animal implements Serializable {
	private String breed;
	private int age;
	
	public Cat(String name, String breed, int age) {
		super(name);
		this.breed = breed;
		this.age = age;
	}
	
	public Cat(Animal animal) {
		super(animal.getName());
		this.breed = ((Cat)animal).breed;
		this.age = ((Cat) animal).age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [breed=" + breed + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(age, breed);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		return age == other.age && Objects.equals(breed, other.breed);
	}
	
	
}	
