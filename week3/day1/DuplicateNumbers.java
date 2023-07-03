package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {4,3,6,8,29,1,2,4,7,8};
		
		 
		Set <Integer> num1 = new LinkedHashSet <Integer> ();
		Set <Integer> dup = new LinkedHashSet <Integer> ();
		
		for (Integer i : num) 
		{
			
				boolean add = num1.add(i);
				if(!add)
					dup.add(i);
		
								
		}
		
		System.out.println("The unique values in the set are "+num1);

		System.out.println("The duplicates in the set are "+dup);

}

	}


