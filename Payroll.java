package Q5;

public class Payroll {
	private int numworkers;
	private double totalPR;
	
	public Payroll() {
		this.numworkers = 0;
		this.totalPR = 0.0;
	}
	
	public void processPayments(Worker worker) {
		double payment = worker.getHoursWorked() * worker.getHoursRate();
		System.out.println("Payment processed for " + worker.getName() + "is " + payment);
		numworkers++;
		totalPR = totalPR + payment;
		
	}
	
	public int getNumWorkers() {
		return numworkers;
	}
	
	public double getTotalPR() {
		return totalPR;
	}
	

}
