package day49_inheritance;
				//  IS - A
public class Ebook extends Book{

	private double size;
	private int pages;
	
	public void readEbook(int pageNum) {
		
		//reading Java book by savitch at page 10
		System.out.println("Reading "+getTitle()+" book by "+ getAuthor() +" at page "+ pageNum);
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "Ebook [size=" + size + ", pages=" + pages + ", getTitle()=" + getTitle() + ", getType()=" + getType()
				+ ", getAuthor()=" + getAuthor() + ", getPrice()=" + getPrice() + "]";
	}
	
}
