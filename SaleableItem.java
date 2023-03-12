package Q5;

public interface SaleableItem {
	
public class Magazine implements SaleableItem {
	private String tittle_mag;
	
	public Magazine(String tittle_mag) {
		this.tittle_mag = tittle_mag;
	}
	
	public void sellCopy() {
		System.out.println("Selling a copy of " + tittle_mag + "magazine");
	}
}
	
public class Ticket implements SaleableItem{
	private String ticket;
	
	public Ticket(String ticket) {
		this.ticket = ticket;
	}
	public void sellCopy() {
		System.out.println("Selling a ticket for " + ticket + "event");	
	}
	
}

}
