package JavaLearning;

public class CalculateEachCharCount {

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
		
		
		String input = "123. It is Work from Home  not Work for Home";
		String find = "spaces";
		int lengthOfText = input.length();
		
		switch(find) {
		case "lowerCase":
			input = input.replaceAll("[a-z]+", "");
			System.out.println("Number of Lower case in the string is: "+(lengthOfText-input.length()));			
			break;
		case "upperCase":
			input = input.replaceAll("[A-Z]+", "");
			System.out.println("Number of Lower case in the string is: "+(lengthOfText-input.length()));
			break;
		
		case "number":
			input = input.replaceAll("[\\d]+", "");
			System.out.println("Number of number in the string is: "+(lengthOfText-input.length()));
			break;
		
		case "spaces":
			input = input.replaceAll("[\\s]+", "");
			System.out.println("Number of spaces in the string is: "+(lengthOfText-input.length()));
			break;
			
		default:
			System.out.println("Enter proper find text");
		}
		/*
		 * String input = "1. It is Work from Home  not Work for Home"; int
		 * lengthOfTheGivenText = input.length();
		 * System.out.println("Length of give text: "+lengthOfTheGivenText);
		 * 
		 * input = input.replaceAll("\\d","");
		 * System.out.println("Total number of numbers in the string is : "+(
		 * lengthOfTheGivenText-input.length())); input =
		 * "1. It is Work from Home  not Work for Home";
		 * 
		 * input = input.replaceAll("\\s","");
		 * System.out.println("Total number of spaces in the string is : "+(
		 * lengthOfTheGivenText-input.length())); input =
		 * "1. It is Work from Home  not Work for Home";
		 * 
		 * input = input.replaceAll("[A-Z]","");
		 * System.out.println("Total number of Uppercase in the string is : "+(
		 * lengthOfTheGivenText-input.length())); input =
		 * "1. It is Work from Home  not Work for Home";
		 * 
		 * input = input.replaceAll("[a-z]","");
		 * System.out.println("Total number of Lowercase in the string is : "+(
		 * lengthOfTheGivenText-input.length())); input =
		 * "1. It is Work from Home  not Work for Home";
		 */
		
		

	}

}
