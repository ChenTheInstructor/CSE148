package p3_binary_io;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainReader {

	public static void main(String[] args) {
		boolean endOfFile = false;
		try {
			FileInputStream fis = new FileInputStream("data/output/data.dat");
			DataInputStream dis = new DataInputStream(fis);
			while (!endOfFile) {
				try {
					String n1 = dis.readUTF();
					System.out.println(n1);
				} catch (EOFException e) {
					endOfFile = true;
				}
			}
			System.out.println("Done reading!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
