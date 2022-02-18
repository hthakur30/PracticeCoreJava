package com.cdac.core;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVsLinkedList {

	public ArrayVsLinkedList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		Create arraylist and add the elements into it
		List<String> al = new ArrayList<String>();
		al.add("Hemant");
		al.add("Debo");
		al.add("Jay");
		al.add("Pragati");
		
//		Create linked list and add the elements into it
		List<String> ll = new LinkedList<String>();
		ll.add("david");
		ll.add("Jack");
		ll.add("Lily");
		ll.add("Alia");
		
		System.out.println("ArrayList " + al);
		System.out.println("LinkedList " + ll);
	}

}
