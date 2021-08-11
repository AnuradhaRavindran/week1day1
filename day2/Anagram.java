package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	String str1 = "stop";
	String str2 = "post";
	char arr1[],arr2[];
	if(str1.length()==str2.length())
	{
		arr1 = str1.toCharArray();
		arr2 = str2.toCharArray();
	}
	
		else
		{
			System.out.println("length is not equal");
			return;
		}
			
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean status = Arrays.equals(arr1, arr2);
		if(status=true)
		{
			System.out.println("given strings are anagram");
		}
		else 
		{
			System.out.println("not anagram");
			

		}
		
	}
	
	
}


