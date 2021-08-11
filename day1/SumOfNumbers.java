package week1.day1;

public class SumOfNumbers {

	public static void main(String[] args) {
		int num = 125;
		int sum = 0;
		while(num>0)
		{
			int rem = num%10;
			sum = sum+rem;
			num = num/10;
			
		}
		System.out.println(sum);

	}

}
