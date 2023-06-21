package week1.day3;

public class Reversestring {

	public static void main(String[] args) {
		String name= "amazon";
		char[] charArray = name.toCharArray();
		
		for (int i = charArray.length-1;i>=0; i--) {
			System.out.print(charArray[i]);
		}
		
}
}
