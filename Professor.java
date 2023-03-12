package Q5;

public class Professor extends Employee{
	private String field;
	private int hours;
	private double calculateSalary;
	
	//public Professor() {
	//	super();
	//}
	
	public Professor(String field, int hours, double calculateSalary) {
		this.field = field;
		this.calculateSalary = hours*30;
	}

}
