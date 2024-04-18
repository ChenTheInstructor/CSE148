package p2;

import java.io.Serializable;
import java.util.Objects;

public class Dog extends Animal implements Serializable{
	private double weight;
	private String color;

	public Dog(String name, double weight, String color) {
		super(name);
		this.weight = weight;
		this.color = color;
	}

	public Dog(Animal animal) {
		super(animal.name);
		this.weight = ((Dog) animal).weight;
		this.color = ((Dog)animal).color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dog [weight=" + weight + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(color, weight);
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
		Dog other = (Dog) obj;
		return Objects.equals(color, other.color)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	
}
