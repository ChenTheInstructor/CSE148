package p2;

import java.io.Serializable;
import java.util.Objects;

public abstract class Animal implements Serializable {
	String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public Animal(Animal animal) {
		this.name = new String(animal.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(name, other.name);
	}
	
	
}
