package com.practicaljava.lesson14.tryit;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList passengerList = new LinkedList();
		passengerList.add("Alex Smith");
		passengerList.add("Mary Lou");
		passengerList.add("Sim Monk");
		
		//Get the lisr iterator and print every element of the list
		ListIterator iterator = passengerList.listIterator();
		
		System.out.println(iterator.next());
		//passengerList.add("VIP customer");
		iterator.add("VIP customer");
		iterator.previous();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
	}

}
