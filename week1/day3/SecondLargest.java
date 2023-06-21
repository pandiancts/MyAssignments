package week1.day3;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String args[]){
	      int temp, size;
	      int[] data = {3,2,11,4,6,7};
	      size = data.length;
	      Arrays.sort(data);
	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(data[i]>data[j]){
	               temp = data[i];
	               data[i] = data[j];
	               data[j] = temp;
	            }
	         }
	      }
	      
	      System.out.println("Second largest number is:"+data[size-2]);
	   }
}

