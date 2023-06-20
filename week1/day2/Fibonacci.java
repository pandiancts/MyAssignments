package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		
		int range = 8;
		int fNum = 0;
		int sNum = 1;
		int sum = 0;
		
		System.out.println("First Number is: " +fNum);
		
		for(int i = 0; i <= range; i++) {
			System.out.print(fNum + ", ");
			sum = fNum + sNum;
			fNum = sNum;
			sNum = sum;
		}
	}

}
