package es.deusto.ingenieria.sd.jdo.inventory;


import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;

@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)

public class Book extends Product {
	String author = null;
	String isbn = null;


	public Book(String name, String desc, double price,
			    String author, String isbn, String publisher) {
		super(name, desc, price);
		this.author = author;
		this.isbn = isbn;

	}
}