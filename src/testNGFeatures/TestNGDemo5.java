package testNGFeatures;

import org.testng.annotations.Test;

public class TestNGDemo5 {

	@Test(priority=-3)
	void funA()
	{

		System.out.println("funA of TestNGDemo2");

	}
	@Test(priority=0)
	void funD()
	{

		System.out.println("funD of TestNGDemo2");

	}
	@Test(priority=-2)
	void funC()
	{

		System.out.println("funC of TestNGDemo2");

	}
	@Test(priority=1)
	void funB()
	{

		System.out.println("funB of TestNGDemo2");

	}
	
}
