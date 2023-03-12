package Q5;

public class Worker {
		private String name;
		private double HoursRate;
		private double HoursWorked;
		
		public Worker(String name, double HoursRate, double HoursWorked) {
			this.setName(name);
			this.setHoursRate(HoursRate);
			this.setHoursWorked(HoursWorked);
			
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getHoursRate() {
			return HoursRate;
		}

		public void setHoursRate(double hoursRate) {
			HoursRate = hoursRate;
		}

		public double getHoursWorked() {
			return HoursWorked;
		}

		public void setHoursWorked(double hoursWorked) {
			HoursWorked = hoursWorked;
		}

}
