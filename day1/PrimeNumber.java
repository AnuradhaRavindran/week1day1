package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int Input =13;
		boolean flag = false;
		for(int i =2 ; i<=0;i++)
		{
		  if(Input%i==0)
		  {
			  
			  System.out.println(Input+ " is not prime Number");
			  flag = true;
			  break;
		  }
		  }
		if(flag==false)
		{
			System.out.println(Input+ " is a prime Number");
		}
		
		
		
	}
		
}
