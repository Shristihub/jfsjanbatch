package com.inter.fun;

@FunctionalInterface
public interface Greetings {

	void greet();
}

interface Compressor{
	void compressFiles(String...filenames);
}

interface DataMiner{
	String showData(String d1, String d2, int size);
}

interface UserDetails{
	void showCourse(String name);
}
