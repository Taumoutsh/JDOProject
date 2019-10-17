package es.deusto.ingenieria.sd.jdo.inventory;

import java.util.ArrayList;
import java.util.List;


import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Join;

@PersistenceCapable
public class Inventory {
	String name = null;
    @Join
	List<Product> products = new ArrayList<Product>();

	public Inventory(String name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return products;
	}
}