/* 
Wrire a program that reads line of text from the keyboard and write to file. Also read the content of the same file and display on monitor
*/
import java.io.*;
import java.util.*;

public class File2015
{
	public static void main(String[] args) {

		/*
		File myFile = new File("random.txt");

		try {
			myFile.createNewFile();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Enter a line from keyboard: ");

		String input;
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		try{
			FileWriter filewriter = new FileWriter("random.txt");
			filewriter.write(input);
			filewriter.close();
		} catch (Exception e) {
			System.out.println("Problem occured writing file. ");
			e.printStackTrace();
		}
		*/

		File myFile = new File("random.txt");

		try{
			Scanner sc = new Scanner(myFile);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
			
		} catch(Exception e) {
			System.out.println("Exception occured here: ");
			e.printStackTrace();
		}

	}

}