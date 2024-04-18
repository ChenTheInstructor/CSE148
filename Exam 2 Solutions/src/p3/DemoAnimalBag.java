package p3;

import java.util.Arrays;

import p2.Animal;
import p2.Cat;
import p2.Dog;

public class DemoAnimalBag {

	public static void main(String[] args) {
		AnimalBag theBag = new AnimalBag(10);
		
		Dog d1 = new Dog("Dog1", 10.4, "White");
		Dog d2 = new Dog("Dog2", 1.4, "Brown");
		Cat c1 = new Cat("Cat1", "cat1", 3);
		Cat c2 = new Cat("Cat2", "cat2", 10);
		
		theBag.insert(d1);
		theBag.insert(d2);
		theBag.insert(c1);
		theBag.insert(c2);
		
	
		Animal[] a = theBag.search(animal -> animal instanceof Dog && ((Dog) animal).getWeight() < 15.5);
		System.out.println(Arrays.toString(a));
		
//		System.out.println(theBag.hasDuplicates());
//		
//		System.out.println(d1.equals(c1));
		
	}

}
