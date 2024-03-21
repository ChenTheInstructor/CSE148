package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import p2_text_file_io.Student;
import p2_text_file_io.StudentBag;

public class FileHandler {
	
	public static void writeTextFile(String filePath) {
		try(FileWriter fw = new FileWriter(filePath)) {
			PrintWriter pw = new PrintWriter(fw);
			pw.println("James");
			pw.println("Karen");
			pw.println("John");
			pw.print(100 +"\t");
			pw.print(12.50 +"\n");
			pw.println(true);
			pw.println('a');
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static StudentBag fillStudentBag2(String filePath) {
		StudentBag theBag = new StudentBag(100);
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while((line = bufferedReader.readLine()) != null) {
				String[] data = line.split(" ");
				String name = data[0];
				int id = Integer.parseInt(data[1]);
				double gpa = Double.parseDouble(data[2]);
				Student s = new Student(name, id, gpa);
				theBag.insert(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return theBag;
	}

	public static StudentBag fillStudentBag(String filePath) {
		StudentBag theBag = new StudentBag(100);
		try (Scanner scanner = new Scanner(new File(filePath))) {
			double total = 0.0;
			int count = 0;
			while(scanner.hasNextLine()) {
				count++;
				String name = scanner.next();
				int id = scanner.nextInt();
				double gpa = scanner.nextDouble();
				Student s = new Student(name, id, gpa);
				theBag.insert(s);
			}
//			theBag.display();
			
		} catch (FileNotFoundException e) {
			System.out.println("The data file cannot be found.");
//			e.printStackTrace();
		}
		return theBag;
	}
}
