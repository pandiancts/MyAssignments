package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicateset {

	public static void main(String[] args) {
		String va="google";
		String output="";
		char[] ch = va.toCharArray();
		Set<Character> name = new LinkedHashSet<Character>();
	
		for(Character i :ch) {
			if(name.add(i)) {
				output = output+i;
				//System.out.println(i);
			}
		}
		System.out.println(name);
		
	}

}
