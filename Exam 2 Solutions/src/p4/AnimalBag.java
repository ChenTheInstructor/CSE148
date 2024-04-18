package p4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
		else
			arr[nElems++] = new Cat(animal);
	}

	public Animal[] search(Predicate<Animal> predicate) {
		Animal[] temp = new Animal[nElems];
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			  // Check if the current animal is a Dog and the predicate applies
	        if (arr[i] instanceof Dog && predicate.test(arr[i])) {
	            temp[count++] = arr[i];
	        }
	        // Check if the current animal is a Cat and the predicate applies
	        else if (arr[i] instanceof Cat && predicate.test(arr[i])) {
	            temp[count++] = arr[i];
	        }

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

	public void importDogs(String path) {
		try (BufferedReader br = new BufferedReader(new FileReader(path));) {
			String line;
			while((line = br.readLine()) != null) {
				String[] a = line.split(" ");
				Dog d = new Dog(a[0], Double.parseDouble(a[1]), a[2]);
				insert(d);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
