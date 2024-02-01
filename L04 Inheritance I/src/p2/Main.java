package p2;

public class Main {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		System.out.println(d1);
		Dog d2 = new Dog("Dog A", 5, 10.5, "Poodle");
		System.out.println(d2);
		Cat c1 = new Cat();
		Cat c2 = new Cat("Cat A", 2, "Black");
		System.out.println(c1);
		System.out.println(c2);
		
		
		d1.speak();
		c1.speak();
		
		
		Pet d3 = new Dog();
		d3.speak();
	}

}
