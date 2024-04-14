package p4_object_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class MainReadObject {

	public static void main(String[] args) {
		

		try (FileInputStream fis = new FileInputStream("data/output/dataObject.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			Student[] s =(Student[]) ois.readObject();
			System.out.println("The object retrieved: " + Arrays.toString(s));
			String str = (String)ois.readObject();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
