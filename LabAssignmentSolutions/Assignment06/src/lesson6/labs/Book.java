package lesson6.labs;

public class Book implements java.io.Serializable {
	String title;
	Author author;
	Integer year;
	public Book(String title, Author author, Integer year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
}
