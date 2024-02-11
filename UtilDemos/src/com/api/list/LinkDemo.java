package com.api.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Java");
		list.addFirst("Junit");
		list.addLast("Angular");
		System.out.println(list);
		list.add(1,"Python");
		list.addFirst("CSS");
		list.set(2, "React");
//		System.out.println(list.get(1));
//		System.out.println(list);
//		
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()) {
//			String s = it.next();
//			System.out.println(s);
//		}
//			
		list.offer("Dotnet");
		System.out.println(list);
		// peek - returns head will not remove
		System.out.println(list.peek());
		// peek - returns head will  remove
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println();
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list.peek());
		
		System.out.println(list.element());
		
		
		
		
		
		
		
			
		
	}
	
}
