package com.inter.fun;

public class LambdaExample {

	public static void main(String[] args) {
		
		//Implement using Lambda expressions
		Greetings lgreetings = ()->{
			System.out.println("welcome");
		};
		// call the method
		lgreetings.greet();
		
		lgreetings = ()->System.out.println("Great day");
		lgreetings.greet();
		
		Compressor compressor = filenames->System.out.println("compressing mp4 files");
		compressor.compressFiles("a.txt","b.txt");
		
		DataMiner miner = (String d1, String d2, int size)->{
			return "data is mined";
		};
		miner.showData("a.txt", "b.txt", 256);
		
		DataMiner miner1 = (d1,d2,size)-> "data is mined using lamb "+d1+d2+size;
		System.out.println(miner1.showData("check","check1",10));
		
		
		UserDetails details = name->System.out.println(name);
		details.showCourse("Java");
		
		
		
		
		
		
		
	}
}
