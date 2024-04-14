package p5_file_existence;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File file = new File("data/output/dataObject.dat");
		if(file.exists()) {
			Bag bag = FileHandler.restoreBag();
		} else {
			Bag bag = new Bag(1000);
		}
	}

}
