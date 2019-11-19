
class Tax {
	double grossIncome;
	String state;
	int dependents;
	static int customerCounter;
	
	static double dollarToEuro(double tax){
		return tax/1.25;
	}
	
	//Constructor
		
	Tax(double grossIncome, String state, int dependents){
		this.grossIncome=grossIncome;
		this.state=state;
		this.dependents=dependents;
		customerCounter++;
		System.out.println("Preparing the tax data for customer #"+customerCounter);
	}
	
	Tax(double grossIncome, int dependents){
		this(grossIncome, "NJ",dependents);
	}
	
	public double calcTax() {
		 return (this.grossIncome*0.33-this.dependents*100);
	 }
		@Override
	public String toString() {
		// TODO Auto-generated method stub
			String tax;
			tax="Gross income is "+this.grossIncome+", state is "+this.state+", dependents are "+this.dependents;
		return tax;
	}
}
