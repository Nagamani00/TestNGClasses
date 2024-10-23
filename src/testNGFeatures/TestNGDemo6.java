package testNGFeatures;

import org.testng.annotations.Test;

public class TestNGDemo6
{

	@Test(priority=0)
	void funA()
	{

		System.out.println("funA of TestNGDemo2");

	}
	@Test(priority=-1)
	void funC()
	{

		System.out.println("funC of TestNGDemo2");

	}
	@Test
	void funB()
	{

		System.out.println("funB of TestNGDemo2");

	}

}
