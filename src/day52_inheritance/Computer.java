package day52_inheritance;

public class Computer {

	private String model;
	private String color;
	@Override
	public boolean equals(Object other) {
		Computer that = (Computer)other;
		if(this.model.equals(that.model) && this.color.equals(that.color)) {
			return true;
		}
		
		return false;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Computer(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	public Computer() {
		super();
	}
	
	
	
	
	
}
