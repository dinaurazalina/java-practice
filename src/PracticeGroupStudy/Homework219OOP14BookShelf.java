package PracticeGroupStudy;

public class Homework219OOP14BookShelf {

	public static void main(String[] args) {
	
		Book b1 = new Book();
		b1.setTitle("HTML");
	System.out.println(b1.capitalize(""));
			System.out.println(b1.isTitleWord("aND"));
			b1.setAuthor("Tackarey");
			System.out.println(b1.getAuthor());
			b1.setId(11);
			b1.setPages(113);
			b1.setTitle("a vanity fair");
			System.out.println(b1.toString());
	}
}
