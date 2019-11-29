package testPackage;

import com.practicaljava.lesson6.*;

public class TestPayIncreasePolyError {

	public static void main(String[] args) {
		/*Lesson7 Part1 Task4 java.lang.ClassCastException
		Person workers[]= new Person[3];
		workers[0]= new Employee("John");
		workers[1]= new Contractor("Mary");
		workers[2]= new ForeignContractor("Steve");
		
		for(Person p:workers) {
			((Payable)p).increasePay(30);
		}
		
		*/
		
		//Lesson7 Part1 Task5 Compiler error
		Payable workers[]= new Payable[3];
		workers[0]= new Employee("John");
		workers[1]= new Contractor("Mary");
		workers[2]= new ForeignContractor("Steve");
		
		for(Payable p:workers) {
			((Payable)p).increasePay(30);
		}

	}

}
