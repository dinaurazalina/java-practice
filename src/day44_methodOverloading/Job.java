package day44_methodOverloading;

public class Job {

	private String title, company;
	private double annualSalary;
	
	public String toString() {
		return "Job [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
	}
	
	public Job() {
		System.out.println("No args constructor");
		title = "undefined";
		company = "undefined";
		
	}
	
	public Job(String title) {
		System.out.println("One args constructor");
		this.title = title;
		company = "undefined";
		
	}
	
	


	public Job(String title, String company, double annualSalary) {
		System.out.println("Three args constructor");
		//you can call method in the constructor
		
		setTitle(title);
		this.company = company;
		this.annualSalary = annualSalary;
	}

	public void setTitle(String title) {
		
		//we can add condititons 
		
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public String getCompany() {
		return company;
	}
	
	public double getAnnualSalary() {
		return annualSalary;
	}
	
	
	
}
