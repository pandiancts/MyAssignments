package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String CompanyName= "PayPal India";
		String output="";
		char[] ch = CompanyName.toCharArray();
		Set<Character> duplichar= new LinkedHashSet<Character>();
		for (Character i : ch) {
			if (duplichar.add(i)) {
				output=output+i;
				
			}
			}
			
		//System.out.println(output);
		System.out.println(duplichar);
	}


	}


