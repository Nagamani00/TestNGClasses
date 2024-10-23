package testNGFeatures;

import org.testng.annotations.Test;

public class TestNGDemo4
{

	@Test(priority=1)
	void funA()
	{

		System.out.println("funA of TestNGDemo2");

	}
	@Test(priority=2)
	void funD()
	{

		System.out.println("funD of TestNGDemo2");

	}
	@Test(priority=3)
	void funC()
	{

		System.out.println("funC of TestNGDemo2");

	}
	@Test(priority=4)
	void funB()
	{

		System.out.println("funB of TestNGDemo2");

	}

}
