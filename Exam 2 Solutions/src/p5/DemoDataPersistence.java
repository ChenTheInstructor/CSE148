package p5;

import p4.AnimalBag;

public class DemoDataPersistence {

	public static void main(String[] args) {
//		AnimalBag theBag = new AnimalBag(10);
//		theBag.importDogs("Dogs.txt");
//		DataHandler.backupBag(theBag);
		
		AnimalBag theBag = DataHandler.restoreBag();
		theBag.display();
	}

}
