package week1.day2;

import java.util.Arrays;

public class SecondLargeInArray {

	public static void main(String[] args) {
		int[] arr = {3,2,11,4,6,7};
		Arrays.sort(arr);
		System.out.println("Second Largest Number is :" +arr[arr.length-2]);

	
	}

}
