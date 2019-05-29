package day44_methodOverloading;

import java.util.*;



public class DiceJob {

	public static void main(String[] args) {

		Job job1 = new Job();

		Job job2 = new Job("Java Developer");

		Job job3 = new Job("SDET", "Amazon", 130_000.0);

		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());
		
		
		//create a list of job and add 5 different jobs with company, salary ans title
		
		
		List <Job> jobsist = new ArrayList<>();
		jobsist.add(job3);
		jobsist.add(new Job("Scrum Master", "Google", 151_000.0));
		jobsist.add(new Job("SDET", "DELTA AIRLINES", 115_000.0));
		jobsist.add(new Job("Tester", "Capital One", 105_000.0));
		jobsist.add(new Job("Senior QA tester", "FreddieMac", 150_000.0));
	
		System.out.println(jobsist);
		
		int idx =-1;
		double max = jobsist.get(0).getAnnualSalary();
		
		for(int i =0; i < jobsist.size(); i++) {
			if(jobsist.get(i).getAnnualSalary() > max) {
				max = jobsist.get(i).getAnnualSalary();
				idx = i;
			}
		}
	
		System.out.println("Highest salary: "+ jobsist.get(idx));
	}

}
