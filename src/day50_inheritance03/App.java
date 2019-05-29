package day50_inheritance03;

public class App {

	private String name;
	public static int count;
	
	public static void builtWith(String lang) {
		System.out.println("Building an app using " + lang);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public App(String name) {
		this.name = name;
	}
	
}
