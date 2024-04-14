package p1_predicate;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileHandler {
	
	public static void backup(StudentBag bag) {
		try(FileOutputStream fos = new FileOutputStream("data/bag.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos); ) {
			oos.writeObject(bag);
			oos.writeObject(Student.getIdCount());
			System.out.println("The bag is backed up.");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public static StudentBag restore() {
		try(FileInputStream fis = new FileInputStream("data/bag.dat");
				ObjectInputStream ois = new ObjectInputStream(fis); ) {
			StudentBag bag = (StudentBag)ois.readObject();
			int idCount = (Integer)ois.readObject();
			Student.setIdCount(idCount);
//			System.out.println("IdCount " + idCount);
			System.out.println("The bag is restored.");
			return bag;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		return null;
	}
}
