package es.deusto.ingenieria.sd.jdo.inventory;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;

@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
public class Product {	
	long id;
	String name = null;
	String description = null;
	double price = 0.0;

	public Product(String name, String desc, double price) {
		this.name = name;
		this.description = desc;
		this.price = price;
	}
}