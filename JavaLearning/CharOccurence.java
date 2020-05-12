package JavaLearning;

import java.util.HashMap;
import java.util.Map;

public class CharOccurence {

	public static void main(String[] args) {
		/*
		 * 1. Write a Java Program to find the occurance of the character 'o' in the
		 * following String. Input: "You have no choice other than following me!"
		 * output: Occurance of o is: 6 2. Check for the palindrome of the given string:
		 * Input: "malayalam" output: Yes, Palindrome Input: "testleaf" output: No, not
		 * a palindrome
		 */
//------First Way----------------------
		String text = "You have no choice other than following me!";
//		int sum = 0;
//		int lengthOfText = text.length();
//		char CharToFind = 'o';
//		System.out.println("length of the given text: " + text + " is >> " + lengthOfText);
//
//		if (text.charAt(0) == CharToFind) {
//			sum = sum + 1;
//		}
//		for (int i = 1; i < lengthOfText; i++) {
//
//			if (text.charAt(i) == CharToFind) {
//				sum = sum + 1;
//			}
//
//		}
//		System.out.println("NUmber of time the character occuring in the given text is " + sum);
//	}
//}
		
//------------2nd Way----------------------
		
		Map<Character, Integer> occurence = new HashMap<Character, Integer>();
		
	}

}
