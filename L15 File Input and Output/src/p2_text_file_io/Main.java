package p2_text_file_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import utils.FileHandler;

public class Main {
	private static StudentBag theBag = new StudentBag(100);

	public static void main(String[] args)  {
		// two ways to read text files
		// BufferedReader
		// Scanner
		
		// Scanner
//		String filePath = "data/input/data1.txt";
//		StudentBag bag = FileHandler.fillStudentBag2(filePath);
//		bag.display();
//		System.out.println("end");
//		FileHandler.fillStudentBag2(filePath);
		String filePath = "data/output/data2.txt";
		FileHandler.writeTextFile(filePath);
	}

}
