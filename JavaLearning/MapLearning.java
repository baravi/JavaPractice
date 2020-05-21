package JavaLearning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapLearning {

	public static void main(String[] args) {
		/*
		 * 1. Write a Java Program to print the keys and values from the Map map = {A=1,
		 * B=2, C=3, D=4, E=5} (Min 3 ways) Note: Even if you google understand what you
		 * are doing! output: A->1 B->2 C->3 D->4 E->5
		 */
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		map.put('A',1);
		map.put('B',2);
		map.put('C',3);
		map.put('D',4);
		map.put('E',5);
		
//First method:
		
		System.out.println("First Method to traverse thro' Map----->");
		  for (Entry<Character, Integer> eachEntry : map.entrySet()) {
		  System.out.println(eachEntry.getKey() +"-> "+eachEntry.getValue());
		  
		  }
		 		
		
//2nd Method:
		  System.out.println("Second Method to traverse thro' Map------->");
		  int size = map.size(); 
		  Set<Character> keySet = map.keySet();
		  List<Character> listSet = new ArrayList<Character>(keySet);
		  List<Integer> values = new  ArrayList<Integer>(map.values());
		  for (int i = 0; i < size; i++) {
		  System.out.println(listSet.get(i)+"-> "+values.get(i));		  
		  }
		 
		
//3rd Method:
		  System.out.println("Third Method to traverse thro' Map------->");
		for (int i = 0; i < size; i++) {
			System.out.println(listSet.get(i)+"-> "+map.get(listSet.get(i)));
			
		}
		
		//4th Method
		 System.out.println("fourth Method to traverse thro' Map------->");
		System.out.println(map);
	}

}
