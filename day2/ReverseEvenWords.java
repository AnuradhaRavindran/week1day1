package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String str = "I am a software tester";
        String[] chararr = str.split(" ");
         for(int i = 0;i<chararr.length;i++)
        {
        	if(i % 2 != 0)
        	{
        		String text = chararr[i];
        		for(int j = text.length()-1;j>=0;j--)
        		{
        			System.out.print(text.charAt(j));
        		}
        	    }
        		else
        		{
        			System.out.print(chararr[i]);
        		}
        	
        	    System.out.print(" ");
        }
	}
}
        
        	       	
       
       
        

