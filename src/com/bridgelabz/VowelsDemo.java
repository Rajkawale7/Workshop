package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsDemo {
	public static void main(String[] args) {
		String Name = "Java";
		String Regex = "[aeiouAEIOU]";
		
		//pattern and matcher
		Pattern pattern = pattern.compile(Regex); //pattern object
		Matcher matcher = pattern.matcher(Name); //Matcher object
		
		boolean result = matcher.matches(Name.remove);

		
		
	}
	

}
