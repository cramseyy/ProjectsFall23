package assignment;

public class StudentWorker extends Student implements Employee{
	//See Assignment 3 or "High Level View of Your Tasks" in Folio to see what Student contains
	
		double hrsWrked;
		double payRate;
		
		/**
		 * @param stuName passed to super
		 * @param stuID passed to super
		 */
		public StudentWorker(String stuName, int stuID) {
			super(stuName, stuID);
		}

		/**
		 * Calculate the pay due to the employee based on rate and hours worked.
		 * Include overtime pay in calculation: Hourly pay rate x 1.5 x overtime hours worked.
		 * Include bonus for student's computed average: 
		 * $300 for 90.0 or greater
		 * $200 for 80. or greater
		 * $100 for 70.0 or greater
		 */
		@Override
		public double calcPay() {
			double initialPay = hrsWrked * payRate;
			double bonus = 0.0;
			double overtime = 0.0;
			
			if(hrsWrked > 40) {
				overtime = (hrsWrked - 40.0) * (payRate * 1.5);
				initialPay = 40 * payRate;
			}else {
				overtime = 0;
			}
			
			if(computeMyAverage() >= 90.0) {
				bonus = 300;
			}else if(computeMyAverage() >= 80.0) {
				bonus = 200;
			}else if(computeMyAverage() >= 70.0) {
				bonus = 100;
			}else {
				bonus = 0;
			}
			
			return initialPay + bonus + overtime;
		}

		/**
		 * Setter for hoursWorked
		 */
		@Override
		public void setHoursWorked(double hrsWrked) {
			this.hrsWrked = hrsWrked;
		}

		/**
		 * Getter for hoursWorked
		 * @return hoursWorked
		 */
		@Override
		public double getHoursWorked() {
			return hrsWrked;
		}

		/**
		 * Setter for payRate
		 */
		@Override
		public void setPayRate(double payRate) {
			this.payRate =  payRate;
		}

		/**
		 * Getter for payRate
		 * @return payRate
		 */
		@Override
		public double getPayRate() {
			return payRate;
		}

		/**
		 * @return String that mentions the super's toString and the pay for the period
		 * e.g.

			Bugsy 521 - pay for this period is $960.00

		 */
		public String toString() {
			 return super.getStuName()+ super.getId()+" - pay for this period is $" + calcPay();
		}
	}