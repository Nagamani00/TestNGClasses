package testNGFeatures;

import org.testng.annotations.Test;

public class TestNGDemo10 
{
	@Test(priority=0)
	void login()
	{
		System.out.println(10/0);
		System.out.println("login of TestNGDemo8 ");
	}
	@Test(priority=1)
	void fundTransfer()
	{

		System.out.println("fundTransfer of Xperson");
	}
}
