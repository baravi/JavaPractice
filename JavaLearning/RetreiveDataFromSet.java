package JavaLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RetreiveDataFromSet {

	public static void main(String[] args) {
		/*
		 * 1. How to remove duplicates from a list? List = "A,B,C,D,A,D,E,F" 2. How to
		 * retrieve a value from a Set? Set = "1,2,3,4,5,6,7,8,9" retrieve and print
		 * only the value - 7
		 */
		
		Set<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		
//		1st Method
//		List<Integer> list = new ArrayList<Integer>(set);	
//		Integer integer = list.get(6);
//		System.out.println(integer);
		
//		2nd method
		for (Integer integer : set) {
			if(integer ==7) {
				System.out.println(integer);
			}
			
		}
		
		

	}

}
