package com.api.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Angular");
		System.out.println(list);
		list.add(1,"Python");
		list.add("CSS");
		list.set(2, "React");
		System.out.println(list.get(1));
//		list.add(10);
		System.out.println(list);
		System.out.println();
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		System.out.println("..........");
		Collections.sort(list);
		for (String course : list) {
			System.out.println(course);
		}
		System.out.println();
		ListIterator<String> listIter = list.listIterator(list.size());
		while (listIter.hasPrevious()) {
			String val = listIter.previous();
			System.out.println(val);
		}
	}

}
