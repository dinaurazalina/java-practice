package day49_inheritance;

public class BarnesAndNobles {

	public static void main(String[] args) {
		
		Ebook ebook = new Ebook();
		
		ebook.setTitle("Introduction to JAVA Programming");
		ebook.setAuthor("Savitch");
		ebook.setPages(1016);
		ebook.setPrice(170);
		ebook.setSize(500);
		ebook.setType("Tech Book");
		
		System.out.println(ebook.toString());
		ebook.readEbook(621);
		
		AudioBook aBook = new AudioBook();
		aBook.setTitle("OCA preparation");
		aBook.setAuthor("Jeanne");
		aBook.setNarrator("Marufjon");
		aBook.listen();
		
		
		PaperBack pBook = new PaperBack();
		pBook.setAuthor("Michelle Obama");
		pBook.setTitle("Becoming");
		pBook.setType("autobiografy");
		pBook.setPages(539);
		pBook.setPrice(30);
		
		System.out.println(pBook.toString());
		
	}
}
