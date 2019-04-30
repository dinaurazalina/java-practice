package PracticeGroupStudy;
import java.util.Scanner;
public class homeworkLaptopReqsIfStatement {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double price = 0;
		String storageType, cpu;
		int ram = 0;
		int memorySize = 0;


		System.out.println("Select screen size:");
		double screenSize = scan.nextDouble();
		if (screenSize == 13.3) {
			price +=200;
		}
		else if(screenSize == 15.0) {
			price +=300;
		}else if (screenSize == 17.3) {
			price +=400;
		}


		System.out.println("Select CPU type:");
		cpu = scan.next();
		if(cpu.equalsIgnoreCase("i3")) {
			price += 150;
		}else if(cpu.equalsIgnoreCase("i5")) {
			price += 250;
		}else {
			price += 350;
		}

		System.out.println("Select RAM size:");
		ram = scan.nextInt();

		price = ram/4 * 50 + price;


		System.out.println("Select storage type:");
		storageType = scan.next();

		System.out.println("Enter memory size:");
		memorySize = scan.nextInt();

		switch (storageType) {
		case "HDD" :
			price = price + memorySize/500*50;
			break;
		case "SSD":
			price = price +memorySize/500*100;
			break;

		}



		System.out.println("Enter screen resolution:");
		String screenResolution = scan.next();
		switch (screenResolution) {
		case "FULLHD":
			price +=100;
			break;

		case "4K":
			price+=200;
			break;
		}





		System.out.println("Laptop price is: $" + price);

	}


}


