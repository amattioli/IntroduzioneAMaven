package it.amattioli.hello;

import static org.apache.commons.lang3.StringUtils.*;

public class HelloWorld {
	
	public static String pad(String s) {
		return center(s,20,"#");
	}
	
	public static void main(String[] args) {
		System.out.println(pad("Hello World!"));
	}
	
}