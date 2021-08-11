package week1.day2;

public class ElementInArray {

	public static void main(String[] args) {
	int[] num = {0,1,2,3,4,6,7,8};
	for(int i = 0;i<num.length;i++)
	{
		if(num[i] != i)
		{
           System.out.println("missing number is : " + i);
           break;
		}
		
	}
	}

	}




