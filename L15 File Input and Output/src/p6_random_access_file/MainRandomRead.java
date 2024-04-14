package p6_random_access_file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MainRandomRead {

	public static void main(String[] args) {
		try (RandomAccessFile raf = new RandomAccessFile("data/output/letter.dat", "r");) {
			int char_size = 2;
			//			char c1 = raf.readChar();
//			System.out.println(c1);
			raf.seek(char_size * 1);
			char c2 = raf.readChar();
			System.out.println(c2);
			
			raf.seek(char_size * 2);
			char c3 = raf.readChar();
			System.out.println(c3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
