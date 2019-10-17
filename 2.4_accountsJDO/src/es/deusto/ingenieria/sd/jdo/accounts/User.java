package es.deusto.ingenieria.sd.jdo.accounts;
import java.util.List;
import java.util.ArrayList;


import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Join;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class User {
	@PrimaryKey
	private String email;
	private String authorizationSystem;
	private String paymentMethod;
	private String defaultDepartureAirport;

	public User(String email, String authorizationSystem, String paymentMethod, String defaultDepartureAirport) {
		this.email = email;
		this.authorizationSystem = authorizationSystem;
		this.paymentMethod = paymentMethod;
		this.defaultDepartureAirport = defaultDepartureAirport;
	}
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String getAuthorizationSystem() {
		return authorizationSystem;
	}

	public void setAuthorizationSystem(String authorizationSystem) {
		this.authorizationSystem = authorizationSystem;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getDefaultDepartureAirport() {
		return defaultDepartureAirport;
	}

	public void setDefaultDepartureAirport(String defaultDepartureAirport) {
		this.defaultDepartureAirport = defaultDepartureAirport;
	}

	public void register(){
		
	}
	
	public void login(){
		
	}
	
	public String makeReservation(){
		
		//String reservationCode;
		
		return null; 
		
	}
	
	public ArrayList<String> searchFlight() {
		
		return null;
		
	}
}