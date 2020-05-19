package JavaLearning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateFromList1 {

	public static void main(String[] args) {
		List<Character> list = new ArrayList<Character>();
		list.add('A');
		list.add('B');
		list.add('A');
		list.add('C');
		list.add('A');
		System.out.println("size of list: " + list.size());
//1st Method
//Set<Character> set = new TreeSet<Character>(list);
//System.out.println("size of set :"+set.size());
//for (Character character : set) {
//	System.out.println(character);
//	
//}

//2ndMethod
		Collections.sort(list);
		List<Character> list1 = new ArrayList<Character>();
		for (Character character : list) {
			if(!list1.contains(character)) {
				list1.add(character);
			}else {
				
			}
				
			
		}
		System.out.println(list1.size());
		
	}

}

/*
 * 1. How to remove duplicates from a list? List = "A,B,C,D,A,D,E,F" 2. How to
 * retrieve a value from a Set? Set = "1,2,3,4,5,6,7,8,9" retrieve and print
 * only the value - 7
 */
