package JavaLearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountOfEachCharacter {

	public static void main(String[] args) {
//		Write a java program to find the count the characters in the given string
//		String str = "Karma is powerful than God"
//		{K=1, a=3, r=2, m=1,  =4, i=1, s=1, p=1, o=2, w=1, e=1, f=1, u=1, l=1, t=1, h=1, n=1, G=1, d=1}
		String str = "Baravi ";
		
		char[] chararray = str.toCharArray();
		
//1 st method:
		Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (char eachChar : chararray) {
			if (map.containsKey(eachChar))
			{
				Integer value = map.get(eachChar);
				value = value + 1;
				map.put(eachChar,value);
			}
			else
			{
				map.put(eachChar, 1);
			}
		
	}
		for(Entry<Character,Integer> eachMapEntry :map.entrySet())	
		{
					System.out.println(eachMapEntry);
					
					
				}
		
		//2nd Method
		
			Set<Character> set = new HashSet<Character>();
			for (int i = 0; i < chararray.length; i++) {
				int length = str.replaceAll("[^" +chararray[i] +"]", "").length();
				boolean add = set.add(chararray[i]);
				if(add)
				System.err.print(chararray[i] + "=" + length + " ");

			}
	 //Method 3
			for (int j = 0; j < chararray.length; j++) {
				char c = chararray[j];
				set.add(c);
			}
//			System.out.println(set);
			List<Character> list=new ArrayList<>(set);
			for (int j = 0; j < list.size(); j++) {
				Character character = list.get(j);
				System.out.print(character + "= " + str.chars().filter(i -> i == character).count() + " ");	
			}
			//Method 4
			
				Hashtable<Character, Integer> charCount= new Hashtable<Character, Integer>();
				int i=0;
				while(i<str.length()) {
					Integer ifPresent =charCount.computeIfPresent(str.charAt(i), (k,v)->v+1);
					if(ifPresent==null)
					 charCount.computeIfAbsent(str.charAt(i),k->1);			
					i++;
				}
				System.out.println(charCount);
			}
}
}
