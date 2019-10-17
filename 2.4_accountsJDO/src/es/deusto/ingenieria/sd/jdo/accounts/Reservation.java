package es.deusto.ingenieria.sd.jdo.accounts;

import java.util.HashSet;

public class Reservation {
	
	private int paymentCode;
	private int numberOfSeats;
	private HashSet<String> passengers;
	private User user;
	private Flight flight;
	
	
	
	public int getPaymentCode() {
		return paymentCode;
	}
	public void setPaymentCode(int paymentCode) {
		this.paymentCode = paymentCode;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public User getUsername() {
		return user;
	}
	public void setUsername(User username) {
		this.user = username;
	}
	
	public void getPayed() {
		
	}

	
	
	
	
	
	
	

}
