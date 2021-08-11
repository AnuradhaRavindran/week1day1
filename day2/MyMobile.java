package week1.day2;


public class MyMobile {
	long phNumber = 87594263L;
	boolean msg = true;
	float paybill = 428.30f;
	public void makeCall()
	{
		System.out.println("We can make calls");
	}
	public void sendMsg()
	{
		System.out.println("We can send messgaes");
	}
	private void payBills()
	{
		System.out.println("Pay bills");
	}

	public static void main(String[] args) {
	MyMobile myobj = new MyMobile();
	System.out.println(+myobj.phNumber);
	System.out.println(+myobj.paybill);
	System.out.println(myobj.msg);
	myobj.payBills();
	myobj.sendMsg();
	myobj.makeCall();
	}

}
