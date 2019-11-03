
public class NJTax extends Tax{
	
	public double calcTax() {
		 if (grossIncome<50000) {
			return grossIncome*0.1;
		}else {
			return grossIncome*0.13;
		}
	 }
	
	double adjustForStudents (double stateTax){
		 double adjustedTax = stateTax-500;
		 return adjustedTax;
	}
}
