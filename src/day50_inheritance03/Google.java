package day50_inheritance03;

public class Google extends SearchEngine {
	@Override
	public int search(String i) {
		System.out.println("Google is searching for "+ i);
		int resultsCount =i.length();
		return resultsCount;
	}
	//protected
	public void search(String item, String item2) { //public is more visible than protected so it can work
		System.out.println("Searching for "+ item+" , "+ item2);
		int resultsCount =item.length()+item2.length() ;
		System.out.println("Total count: "+ resultsCount);
	}
	
	//it was default >  we can use private, protected
	protected String clickResult() {
		System.out.println("Clicking result");
		return "Search result page";
	}
	
}
