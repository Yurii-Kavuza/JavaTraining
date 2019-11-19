
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tax t1=new Tax(50000,2);
		Tax t2=new Tax (65000,"TX", 4);
		double yourTax=t1.calcTax();
		double hisTax=t2.calcTax();
		System.out.println(t1);
		System.out.println("Your tax is "+Tax.dollarToEuro(yourTax)+" Euro");
		System.out.println(t2);
		System.out.println("His tax is "+Tax.dollarToEuro(hisTax)+" Euro");

	}

}
