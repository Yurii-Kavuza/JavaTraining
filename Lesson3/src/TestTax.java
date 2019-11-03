
public class TestTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NJTax	t =	new	NJTax();	//	creaEng	an	instance	of	Tax	
		
		t.grossIncome=	80000;		//	assigning	the	values	
		t.numberOfDependents=	2;	
		t.state="NJ";	
																				
		double	yourTax	=	t.calcTax(); //calculaEng	tax	
		
		double njt=t.adjustForStudents(yourTax);
																			
	
		System.out.println("Your tax is " + yourTax);
		System.out.println("Your tax adjust to student is " + njt);

	}

}
