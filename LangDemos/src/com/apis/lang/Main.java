package com.apis.lang;

public class Main {

	public static void main(String[] args) {
		String str ="Dell";
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println(i+ " "+str.charAt(i));
					System.out.println(j+" "+str.charAt(j));
				}
			}
		}
	}
}
