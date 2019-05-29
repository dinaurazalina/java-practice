package OfficeHourswithMurodil6to7;

public class officeHoursWithVasyl {

	public static void main(String[] args) {
		
		String text = "wind: 5 mph";
		 //let's create if statement in order to determine if wind is safe
         //if speed is more than 30 mph print: You are in danger!
         //Otherwise, print: "You are safe!"
	
			//get a text with a speed
		String speed = text.substring(text.indexOf(":")+2, text.lastIndexOf(" "));
		
			// We need to convert the text into a number
	
		int convertedSpeed= Integer.parseInt(speed);
		System.out.println("Speed: " + convertedSpeed);
			//condition
	if(convertedSpeed> 30) {
		System.out.println("You are in danger!");
	}else {
		System.out.println("You are safe!");
	}
	
	
	}
}
