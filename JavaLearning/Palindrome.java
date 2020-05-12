package JavaLearning;

import cucumber.runtime.snippets.Concatenator;

public class Palindrome {

	public static void main(String[] args) {
		/*
		 * 1. Write a Java Program to find the occurance of the character 'o' in the
		 * following String. Input: "You have no choice other than following me!"
		 * output: Occurance of o is: 6 2. Check for the palindrome of the given string:
		 * Input: "malayalam" output: Yes, Palindrome Input: "testleaf" output: No, not
		 * a palindrome
		 */
		String text = "malayalam";
		String reverse = "";
		/*
		 * Unary a++ a-- ++a --a binary +,-,*,/,%, <,>,<=,>=,==,!=,= short hand operator
		 * a= a+5; a+=5; a = a*3; a*=3; Ternary Operator Condition ? True Statement :
		 * False Statement
		 */
		int lengthOfText = text.length();
		System.out.println(lengthOfText +": Length of the text");
		for (int i = lengthOfText - 1; i >= 0; i--) {

			reverse = reverse.concat(Character.toString(text.charAt(i)));

		}
		System.out.println(reverse);
		System.out.println(reverse.equals(text)?"Yes,palindrome":"Not,a palindrome");
		/*if (reverse.contentEquals(text)) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given string is not palindrome");*/
//}
//
//
		}

	}

