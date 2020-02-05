package com.practicaljava.lesson15.tryit;

import java.util.ArrayList;

public class TestGenericMethod {

	public static void main(String[] args) {
		RetiredEmployee re1=new RetiredEmployee("re1");
		RetiredEmployee re2=new RetiredEmployee("re2");
		ArrayList<RetiredEmployee> listRE= new ArrayList<RetiredEmployee>();
		listRE.add(re1);
		listRE.add(re2);
		ArrayList<Employee> listEmpl=new ArrayList<Employee>();
		Employee empl1 = new Employee("empl1"); 
		listEmpl.add(empl1);
		listEmpl.addAll(listRE);
		
		for (Employee employee : listEmpl) {
			System.out.println(employee.getName());
			System.out.println(employee.getClass());
			System.out.println(employee);
			System.out.println("");
		}

	}

}
