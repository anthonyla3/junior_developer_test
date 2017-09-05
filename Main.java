import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Main class.
public class Main {

	//File Name.
	private static final String FILENAME = "ipaddress.txt";
	
	public static void main(String[] args) {
		//Test the time taken for the validating IP addresses and sorting students methods.
		measureMethodTimeTaken();
		
	}
	
	//Validate IP Addresses.
	private static void validateIPAddress() {
		System.out.println("Validate IP Address");
		System.out.println("---------------------------------------------------");
		
		//Get file path. Text file may need to be placed into bin folder or class folder.
		URL path = Main.class.getResource(FILENAME);
		//Create buffer reader.
		BufferedReader br = null;
		//Create the file from path.
		File f = new File(path.getFile());
		
		//Try to read current line and prints out the valid IP addresses.
		try {
			br = new BufferedReader(new FileReader(f));
			String currentLine;
			while ((currentLine = br.readLine()) != null) {
				if (IPValidationRegex.validate(currentLine)) {
					System.out.println(currentLine);
				}
			}
		}
		//Catch input output error and print it.
		catch (IOException e) {e.printStackTrace();}
		//Close buffer reader when done.
		finally {
			try { if (br != null) br.close();} 
			catch (IOException ex) {ex.printStackTrace();}
		}
	}
	
	//Sort students.
	private static void sortStudents() {
		System.out.println("Sort Students");
		System.out.println("---------------------------------------------------");
		
		//Create list of students and add them.
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(33, "Tina", 3.68f));
		students.add(new Student(85, "Louis", 3.85f));
		//students.add(new Student(35, "Louis", 3.85f)); //Extra record for testing purposes for names that are the same with same grades
		students.add(new Student(56, "Samil", 3.75f));
		students.add(new Student(19, "Samar", 3.75f));
		students.add(new Student(22, "Lorry", 3.76f));
		
		//Student sort class.
		StudentSort studentSort = new StudentSort();
		
		//Sorts the list of students with the student sort class.
		Collections.sort(students, studentSort);
		
		//Prints out the list of students after sorting it.
		for (Student student:students){
			System.out.println(student.getID() + ", " + student.getName() + ", " + student.getGPA());
		}
	}
	
	//Time taken for methods to be ran.
	private static void measureMethodTimeTaken() {
		
		//Java 8 - Lambdas
		//Runnable method = () -> questionOne(); //Change method name.
		
		//Creates a runnable for validating IP addresses.
		Runnable method1 = new Runnable() {
			@Override
			public void run() {
				validateIPAddress(); //Change this to any other method to test other classes.
			};
		};
		
		//Creates a second runnable for sorting students.
		Runnable method2 = new Runnable() {
			@Override
			public void run() {
				sortStudents(); //Change this to any other method to test other classes.
			};
		};
		
		//Test time taken to validate IP addresses.
		MethodTimer.start(method1);
		//Test time taken for sorting students.
		MethodTimer.start(method2);
		
	}

}
