package JavaLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegexLearning {

	public static void main(String[] args) {
//		1. Write a java program to verify whether the given String is valid email address.
//		Input: "balaji.chandrasekaran@testleaf.com"
//		output: true
//		Input: "balaji.c@tunatap.co.uk"
//		output: true
//		Input: "naveen e@tl.com"
//		output: false
//		Note: Spl characters like . _ are only allowed
//		2. Write a java program to validate the given username is valid or not
//		Input: "Balaji_1"
//		output: false
//		Input: "Testleaf$123"
//		output: false
//		Note: 
//		1. It should contain minimum 8 characters.
//		2. It allows alpha numeric characters and spl characters like . _ @ $
//
//		balaji.chandrasekaran@testleaf.com
//		balaji.c@tunatap.co.uk
//		naveen e@tl.com
		/*
		 * List<String> emails = new ArrayList<String>();
		 * 
		 * emails.add("balaji.chandrasekaran@testleaf.com");
		 * emails.add("balaji.c@tunatap.co.uk"); emails.add("naveen e@tl.com"); String
		 * regex = "[a-zA-Z0-9._]+@[a-z0-9]+.[a-z.]{2,}";
		 * 
		 * Pattern pattern = Pattern.compile(regex); for (String eachEmails : emails) {
		 * Matcher matcher = pattern.matcher(eachEmails); System.out.println(eachEmails
		 * + " " + (matcher.matches()));
		 * 
		 * }
		 */
		//----2nd Program
		List<String> uName = new ArrayList<String>();

			uName.add("Balaji_1");
			uName.add("Testleaf$123");
		
		String regex1 ="[a-zA-Z0-9._$@]{8,}";

		Pattern pattern = Pattern.compile(regex1);
		for (String eachUName : uName) {
			Matcher matcher = pattern.matcher(eachUName);
			System.out.println(eachUName + " " + (matcher.matches()));

		}

	}

}
