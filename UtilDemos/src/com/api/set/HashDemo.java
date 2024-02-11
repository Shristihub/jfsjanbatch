package com.api.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashDemo {

	public static void main(String[] args) {
//		Set<String> hashSet = new HashSet<>();
//		Set<String> hashSet = new LinkedHashSet<>();
		Set<String> hashSet = new TreeSet<>();
		hashSet.add("Java");
		hashSet.add("Angular");
		System.out.println(hashSet);
		hashSet.add("Python");
		hashSet.add("CSS");
		hashSet.add("React");
		System.out.println(hashSet.size());
		
		Iterator<String> it = hashSet.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}
