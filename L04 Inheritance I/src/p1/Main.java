package p1;

public class Main {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		System.out.println(d1);
		Dog d2 = new Dog();
		System.out.println(d2);
		
		Dog d3 = new Dog("DogA", 5, 50.5, "Golden");
		System.out.println(d3);
		
		Cat c1 = new Cat();
		Cat c2 = new Cat("CatA", 2, "Black");
		System.out.println(c1);
		System.out.println(c2);
	}

}
