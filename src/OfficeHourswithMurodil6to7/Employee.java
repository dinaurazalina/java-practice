package OfficeHourswithMurodil6to7;

public class Employee {
	String firstName;
	String lastName;
	int employee_id;
	int age;
	float hourly_rate;
	char gender;
	boolean isInsured;
	String title;
	String email;
	String [] titles = {"developer", "Scrum master", "SDET", "PO", "QA Analyst", "BA", "HR"};
	
	public void printInfo() {
		System.out.println("First Name: "+ firstName+ ", Last Name: "+lastName + ", employee ID: "+employee_id
							+" Age: " + age + ", Hourly rate: "+hourly_rate+ ", Gender: "+ gender
							+" Insured? "+isInsured+ ", Job title: "+ title +", email: "+ email );
	
	
	}
	//method that will generate an email for employee
	
	public String generateEmail() {
	//we are creating a new email
		String Newemail = firstName.toLowerCase() +"_"+ lastName.toLowerCase() + "@gmail.com";
	email = Newemail;
				return email;
	}
	public void setEmail(String e) {
		//lets check if email is valid before changing it
		
	if(e.contains("@")) {
		email =e; 
	}else {
		System.out.println("Email is not valid");
	}
	}
	public void printEmail() {
		System.out.println("Email of"+ firstName+" "+ lastName +" : " + email);
	}
	
	//this method will validate title before setting it
	public void setJobTitle(String str) {
		//by default it false
		boolean isValid = false;
		for(String t: titles) {
			if(t.equals(str)) {
				//if we verify that the title is valid
				//then we will set this title and isValid will become true
				title = str;
				//and isValid will become a true
				//it will set to true only if this condition is true: t.equals(str)
				isValid = true;
			}
		}
		if(isValid) {
			System.out.println("Title was set successfully");
		}else {
			System.out.println("Invalid title");
		}
	} 
}
