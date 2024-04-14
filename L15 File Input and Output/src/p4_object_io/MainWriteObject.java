package p4_object_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainWriteObject {

	public static void main(String[] args) {
		Student s1 = new Student("Joe", 3.5);
		Student s2 = new Student("Alan", 3.5);
		Student s3 = new Student("Suzy", 3.5);
		Student[] arr = {s1, s2, s3};
		
		try (FileOutputStream fos = new FileOutputStream("data/output/dataObject.dat", true);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(arr);
			oos.writeObject("hello");
			System.out.println("Done Writing!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
