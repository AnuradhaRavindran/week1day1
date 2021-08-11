package week1.day2;

public class MyCaliculator {

	public static void main(String[] args) {
		Caliculator obj = new Caliculator();
		System.out.println("The addition of Numbers is : " + obj.add(14, 20, 30));
		System.out.println("The Subtraction  of Numbers is : " + obj.sub(50, 40));
		System.out.println("The Multiplication of Numbers is :" + obj.mul(25.1, 15.2));
		System.out.println("The division of Numbers is : " + obj.div(14.12,7.11));

	}

}
