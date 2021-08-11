package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		String str ="$$ Welcome to 2nd Class of Automation $$";
		int letter = 0,space =0,num=0,specialChar=0;
		char[] arr = str.toCharArray();
		for(int i =0;i<arr.length;i++)
		{
			if(Character.isLetter(arr[i]))
			{
				letter++;
			}
			else if(Character.isDigit(arr[i]))
			{
				num++;
			}
			else if(Character.isSpaceChar(arr[i]))
			{
				space++;
			}
			else
			{
				specialChar++;
			}
				
			
		}
		System.out.println("Letter : " + letter);
		System.out.println("Space : " + space);
		System.out.println("Number : " + num);
		System.out.println("SpecialCharacter : " + specialChar);

	}

}
