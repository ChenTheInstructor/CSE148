package p5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import p4.AnimalBag;

public class DataHandler {

	public static void backupBag(AnimalBag theBag) {
		try (FileOutputStream fos = new FileOutputStream("bagData.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			oos.writeObject(theBag);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static AnimalBag restoreBag() {
		AnimalBag theBag = null; 
		try (FileInputStream fis = new FileInputStream("bagData.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			theBag = (AnimalBag)(ois.readObject());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return theBag;
	}
}
