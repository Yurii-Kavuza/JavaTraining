package com.practicaljava.lesson15.tryit;

public class Employee implements Payable{
    private String name;
    
    public String getName() {
		return name;
	}
    
    public Employee(String name){
           this.name=name;
    }
    
    public boolean increasePay(int percent) {
        System.out.println("Increasing salary by " + percent 
       + "%: " + name); 
       return true;
 }

}
