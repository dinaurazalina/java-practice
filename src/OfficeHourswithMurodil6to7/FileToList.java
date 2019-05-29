package OfficeHourswithMurodil6to7;
import java.util.*;
import java.io.*;
public class FileToList {

	public static void main(String[] args) throws FileNotFoundException {
		//create file object
		File file = new File("product.txt");
		//open file using scanner
		Scanner scan = new Scanner(file);

		//it reads a line and switches to next line
//		System.out.println(scan.nextLine());
//		System.out.println(scan.hasNextLine());//ask if there are any more lines
//		System.out.println(scan.nextLine());
//		
		ArrayList<String> data = new ArrayList<>();
		while(scan.hasNextLine()) {
		String line = scan.nextLine();
		data.add(line);
		}
		
		System.out.println("Number of products : " + data.size());
		System.out.println(data.toString());
	}
}
