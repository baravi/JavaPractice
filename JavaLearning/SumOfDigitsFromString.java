package JavaLearning;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		/*
		 * Difficulty level: Medium 1. Write a java code to find the sum of the given
		 * numbers Input: "asdf1qwer9as8d7" output: 1+9+8+7 = 25 2. Write a java program
		 * to do the following. Input:
		 * "When the world realise its own mistake, corona will dissolve automatically"
		 * output:
		 * "When eht world esilaer its nwo mistake, anoroc will evlossid automatically"
		 * 3. Write a java program to find the number of Uppercase, lowercase, numbers
		 * and spaces in the following String. Input:
		 * "1. It is Work from Home  not Work for Home"
		 */
		int sum = 0;
		String input = "asdf1qwer9as8d7";
	String numberOnly = input.replaceAll("\\D", "");
		System.out.println(numberOnly);
		for (int i = 0; i < numberOnly.length(); i++) {
			
		int temp = Integer.parseInt(Character.toString(numberOnly.charAt(i)));
		sum = sum + temp;
			
		}
System.out.println("sum of the available digits in the string("+input+") is: "+sum);
	}

}
