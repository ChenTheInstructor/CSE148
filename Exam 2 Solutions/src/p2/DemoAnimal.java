package p2;

public class DemoAnimal {

	public static void main(String[] args) {
		Dog dog = new Dog("Dog1", 10.5, "White" );
		
		Cat cat = new Cat("Cat1", "breed1", 3);
		
		System.out.println(dog == new Dog(dog));
		System.out.println(cat == new Cat(cat));
		
		System.out.println(dog == dog);
	}

}
