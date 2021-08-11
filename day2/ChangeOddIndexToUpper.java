package week1.day2;

public class ChangeOddIndexToUpper {

	public static void main(String[] args) {
		String str = "changeme";
		char[] arry = str.toCharArray();
		for(int i =0;i<arry.length;i++)
		{
			if(i%2!=0)
			{
				
			System.out.print(Character.toUpperCase(arry[i]));
			}
			else
			{
				System.out.print(arry[i]);
		
	        }

}
}
}
