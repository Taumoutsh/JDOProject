package es.deusto.ingenieria.sd.jdo.inventory;

import javax.jdo.Extent;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

public class Main {

	public static void main(String[] args) {
		
		try {
			PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
			PersistenceManager pm = pmf.getPersistenceManager();
	
			Transaction tx = pm.currentTransaction();
			
			try {				
				Inventory inv = new Inventory("My Inventory");				
				inv.getProducts().add(new Product("Samsung Galaxy S5", "Good condition", 99.99));
				inv.getProducts().add(new Product("Apple IPad Mini", "Siver color; perfect", 199.99));
				inv.getProducts().add(new Book("Dracula", "First Edition", 200.99, "Bram Stoker", "0486411095", "Dover Publications"));
								
				tx.begin();
				pm.makePersistent(inv);
				
				System.out.println("Inserting contents into the database ....");
				tx.commit();
			} catch (Exception ex) {
				System.out.println("# Error storing objects: " + ex.getMessage());				
			} finally {
				if (tx.isActive()) {
					tx.rollback();
				}
				
				pm.close();
			}			
		
			pm = pmf.getPersistenceManager();			
			tx = pm.currentTransaction();
			
			try {
				
			    tx.begin();
	
			    Extent<Product> extentP = pm.getExtent(Product.class);
				int cont = 0;
			    for (Product p : extentP) {
			    	System.out.println((cont++) + " - " + p.name + " - " + p.description);
			    }

			    tx.commit();
			} catch (Exception ex) {
				System.out.println("# Error getting Extent: " + ex.getMessage());
			} finally {
			    if (tx.isActive()) {
			        tx.rollback();
			    }
	
			    pm.close();
			}

			pm = pmf.getPersistenceManager();
			tx = pm.currentTransaction();

			try {
			    tx.begin();
			    				
				Extent<Inventory> extentI = pm.getExtent(Inventory.class);

				for (Inventory inventory : extentI) {
				    pm.deletePersistent(inventory);	
				}
				
				Extent<Product> extentP = pm.getExtent(Product.class);
				
				for (Product product : extentP) {
				    pm.deletePersistent(product);	
				}				
				System.out.println("Deleting database contents....");
			    tx.commit();
			} catch (Exception ex) {
				System.out.println("# Error cleaning DB: " + ex.getMessage());
				ex.printStackTrace();
			} finally {
			    if (tx.isActive()) {
			        tx.rollback();
			    }
	
			    pm.close();
			}

			} catch (Exception ex) {
			ex.printStackTrace(System.err);
		}
		
	}
}