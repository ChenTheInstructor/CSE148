package p4_finally;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Demo {

	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
//			FileReader fileReader = new FileReader("test.txt")
			reader = new BufferedReader(new FileReader("test.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally { // finally block: this block is always executed regardless exceptions or not
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("End");
	}

}
