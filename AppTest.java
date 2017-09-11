package DriverFactory;

import org.testng.annotations.Test;

public class AppTest{

	
	@Test
	
	public void KickStart() throws Exception
	{
		
		System.out.println("Starting point");
		DriverScript ds=new DriverScript();
		ds.startTest();
	}
	
}
