package p4;

public class DemoImportData {

	public static void main(String[] args) {
		AnimalBag theBag = new AnimalBag(10);
		theBag.importDogs("Dogs.txt");
		theBag.display();
	}

}
