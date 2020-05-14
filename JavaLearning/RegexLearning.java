package JavaLearning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLearning {
//-----email validation-------
	/*
	 * public static void main(String[] args) { String input = "cbaravi@gmail.com";
	 * String pattern = "[a-z]+@[a-z]+.[a-z]{2,3}";
	 * 
	 * Pattern compile = Pattern.compile(pattern); Matcher matcher =
	 * compile.matcher(input); System.out.println(matcher.matches()); }
	 */

	//------ String work--------
	public static void main(String[] args) {
		
		String input = " i Have the numbers 1 like 2 and 5";
		System.out.println("Before regex: "+ input);
		input = input.replaceAll("\\D", "");
		System.out.println("After regex: "+input);
}
}