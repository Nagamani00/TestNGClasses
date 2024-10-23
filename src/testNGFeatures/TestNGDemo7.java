package testNGFeatures;

import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGDemo7
{

	@Test(enabled=false)
	void funA()
	{

		System.out.println("funA of TestNGDemo7");
	}
	@Ignore
	void funB()
	{
		System.out.println("funB of TestNGDemo7");
	}
	@Test
	void funC()
	{
		System.out.println("funC of TestNGDemo7");
	}
	@Test(enabled=false)
	void funD()
	{
		System.out.println("funD of TestNGDemo7");
	}
	@Test
	void funE()
	{

		System.out.println("funE of TestNGDemo7");

	}
	@Test
	void funF()
	{

		System.out.println("funF of TestNGDemo7");
		throw new SkipException("Do not execute this program");
		//			System.out.println( new SkipException("Do not execute this program"));
		//			System.out.println("Done");
	}}


