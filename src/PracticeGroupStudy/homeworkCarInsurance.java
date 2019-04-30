package PracticeGroupStudy;
import java.util.*;
public class homeworkCarInsurance {
	public static void main(String[] args) {

    //DO NOT CHANGE
		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
    //WRITE YOUR CODE HERE
		
		System.out.println("Enter your name");
		name = scan.nextLine();
		
		System.out.println("Do you have a US driver license?");
		String yesNo = scan.next();
		if(yesNo.equals("No")) {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		
		System.out.println("Enter your zip code");
		int zipcode = scan.nextInt();
		if (zipcode == 20910 || zipcode == 20740) {
			
			premium +=60;
		}else if(zipcode == 22102 || zipcode == 22103) {
			
			premium +=30;
			
		}else {
			premium +=50;
		}	
		
		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		
		vehicleOwnership = scan.next();
		if (vehicleOwnership.equalsIgnoreCase("owned")) {
			premium += 10;
		}else {
			premium += 20;
		}
		
		System.out.println("How is this vehicle primarily used?");
		
		vehicleUsage = scan.next();
		
		switch(vehicleUsage) {
		
		case "Business":   
			premium += 50;
			break;
			
		case "Pleasure":   
			premium += 10;
			break;
			
		case "Commute":   
			premium += 20;
			break;
				
		}
			
		if (vehicleUsage.equals("Commute")){
			System.out.println("Days Driven To Work And/Or School");
			daysDrivenToWorkOrSchool = scan.nextInt();
			
			premium = premium + daysDrivenToWorkOrSchool * 5;
			
			System.out.println("Miles Driven To Work And/Or School");
			milesToWorkOrSchool = scan.nextInt();
			
			premium = premium + milesToWorkOrSchool * 1.0;
		}
		
		
		
		System.out.println("How old are you?");
		
		int age = scan.nextInt();
		
		if (age <16 ) {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		
		
		if(age >=16 && age <18) {
			premium *= 20;
			
		}else if(age >=18 && age <=21) {
			premium *= 6;
			
		}else if(age >21 && age <25) {
			premium *= 2;
		}
		
		System.out.println("How many years you've been driving?");
		
		int experienceNum = scan.nextInt();
		
		if(experienceNum <0) {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		
		if (experienceNum >= 0) {
			if (age - experienceNum == 16 || age - experienceNum > 16 ) {
				
				premium = premium - 5*experienceNum; 
			}else {
				System.out.println("Invalid data!");
				System.exit(0);
			}
		} 
		
		
		System.out.println("Have you had any accidents in the last 5 years?");
		
		String accidents = scan.next();
		if (accidents.equalsIgnoreCase("Yes")) {
			System.out.println("How many?");
			accidentsAmount = scan.nextInt();
			premium = premium* 0.2 * accidentsAmount+ premium;
		
		}
		
		System.out.println("Have you had continuous insurance for the past 12 months?");
		continuousInsurance = scan.next();
		if (continuousInsurance.equalsIgnoreCase("No")){
			premium = premium *2;
		}
		
		
		System.out.println("What is the highest level of education you have completed?");
		String education = scan.next();

		if(education.equals("PhD") || education.equals("Bachelors")  || education.equals("Masters") ) {
			premium = premium - premium * 0.05;
		} else if(education.equals("Doctors")) {
			premium = premium -premium * 0.1;
		}else {
			premium = premium +premium* 0.05;
			education = "LessthanHighSchool";
		}
			
		
		System.out.println( name +", here's your quote!");
		System.out.println("Start Your Policy Today For: " + premium);
		String levelOfEdu = education.replace(" ", "");
		referenceNumber = name.substring(0,2) + age +name.substring(name.length()-2, name.length()-1)
		+ zipcode + levelOfEdu;
		
		System.out.println("Reference number:" +referenceNumber.toUpperCase());
		
		
	/*
	 * 
	 * 
	 * Ray
Yes
20910
Owned
Business
45
10
Yes
1
Yes
Less than High School

	 */
		
		
	}
	}