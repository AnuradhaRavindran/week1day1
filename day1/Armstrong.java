package week1.day1;

public class Armstrong {

	public static void main(String[] args) {
		int num = 153;
		int total=0, remainder; 
	      int original = num;
		while(num>0)
		{
			remainder = num % 10;
			total = total +(remainder*remainder*remainder);
			num = num/10;
		}
         if(total==original)
         {
        	 System.out.println( + original +  " is Armstrong");
         }
         else
        	 System.out.println( + original + " is not Armstrong");
	}

}
