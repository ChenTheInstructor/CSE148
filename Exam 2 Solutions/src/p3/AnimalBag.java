package p3;

import java.io.Serializable;
import java.util.Arrays;
import java.util.function.Predicate;

import p2.Animal;
import p2.Cat;
import p2.Dog;

public class AnimalBag implements Serializable{
	private Animal[] arr;
	private int nElems;

	public AnimalBag(int maxSize) {
		arr = new Animal[maxSize];
	}

	public void insert(Animal animal) {
		if (animal instanceof Dog)
			arr[nElems++] = new Dog(animal);
		else if (animal instanceof Cat)
			arr[nElems++] = new Cat(animal);
	}

	public Animal[] search(Predicate<Animal> predicate) {
		Animal[] temp = new Animal[nElems];
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			  // Check if the current animal is a Dog and the predicate applies
	        if (/*arr[i] instanceof Dog && */predicate.test(arr[i])) {
	            temp[count++] = arr[i];
	        }
//	        // Check if the current animal is a Cat and the predicate applies
//	        else if (/*arr[i] instanceof Cat && */ predicate.test(arr[i])) {
//	            temp[count++] = arr[i];
//	        }

		}
		return Arrays.copyOf(temp, count);
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
	public boolean hasDuplicates() {
	    for (int i = 0; i < nElems - 1; i++) {
	        for (int j = i + 1; j < nElems; j++) {
	            if (arr[i].equals(arr[j])) {
	                return true;
	            }
	        }
	    }
	    return false;
	}


}
