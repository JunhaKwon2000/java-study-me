package pkg_homework.homework01.model.vo;

public class Book implements Comparable<Book> {

	// field
	private String title;
	
	private String author;
	
	private String category;
	
	private int price;
	
	
	// constructor
	public Book() {}


	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}


	// method
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		// 느리게 나이드는 습관(정희원), 인문, 16200
		return title + "(" + author + "), " + category + ", " + price;
	}
	
    @Override
    public int compareTo(Book o) {
    	return getTitle().compareTo(o.getTitle());
    }
	
	
}
