package day42_customClassesEncapsulation;

public class PERSON {
//declare name and age encapsulated data
	private String name;
	
	private int age;
	
	//create getter and setter public for name
	//read only
	
	public String getName() {
		
		return name;
	}
	
	//write only methods -void
	public void setName(String name) {
	this.name = name;
	}
}
