package p5_file_existence;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileHandler {
	public static Bag restoreBag() {
		try (FileInputStream fis = new FileInputStream("data/output/dataObject.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			Bag bag = (Bag)ois.readObject();
			return bag;
		}
	}
}
