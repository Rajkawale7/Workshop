package com.bridgelabz;
import java.util.regex.*;
public class Vowels {
	public static void main(String[] args) {
		String Name = "Java";
		
		//Taking Regex Pattern to check
		String Regex = "[(aeiouAEIOU)]";
		String result = Name.replaceAll(Regex, Name);
		 
		System.out.println("Modified result: " + result);
	}

}


//WAP to replace all the vowels in a given string with a specified character and to remove all non-alphanumeric characters from a given string.
//Sample OUtput:
//    Original string: Java
//    After replacing vowels: J*v*