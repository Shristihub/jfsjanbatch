package com.exceptions.basic;

public class FinallyDemo {
	
	// try+catch
	// try+catch+catch
	// try+catch+finally
	// try+finally

	// finally is a block
	// is used to release the resources(close the db connection, close the file)
	public static void main(String[] args) {
		try {
			System.out.println("welcome");
			int num = Integer.parseInt("0");
			System.out.println("Number " + num);
			int result = 10 / num;
			System.out.println("Result " + result);
//		} catch (Exception e) {
//			System.out.println(e);
		}finally {
			System.out.println("close the db connection");
		}
		System.out.println("completed");

	}

}
