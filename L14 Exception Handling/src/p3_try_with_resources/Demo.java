package p3_try_with_resources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		StringBuilder message = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader("data/input/test.txt")) ) {
			String line = reader.readLine();
			while(line != null) {
//				System.out.println(line);
//				message += line + " ";
				message.append(line + " ");
				line= reader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println(message);
		}
	}

}
