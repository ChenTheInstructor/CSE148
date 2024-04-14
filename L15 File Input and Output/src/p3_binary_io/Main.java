package p3_binary_io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String[] arr = { "A", "B", "D", "E", "R", "Z" };
		try (FileOutputStream fos = new FileOutputStream("data/output/data.dat");// try with resources
				DataOutputStream dos = new DataOutputStream(fos);) { // wrapper class
//			dos.writeDouble(12445653.5002445435345);
//			dos.writeDouble(43453.234567);
//			dos.writeChar('A');
//			dos.writeChar('B');
//			dos.writeUTF("He");
			for (String n : arr) {
				dos.writeUTF(n);
			}
//			dos.close();
			System.out.println("Done writing!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
