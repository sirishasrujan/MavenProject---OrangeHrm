package DriverFactory;

import org.openqa.selenium.WebDriver;

import CommonFuctionLibrary.FunctionLibrary;
import Utilities.ExcelfileUtil;

public class DriverScript {
	WebDriver driver;

	public void startTest() throws Exception
	{
		
    System.out.println("Driverscript");
		ExcelfileUtil xis= new ExcelfileUtil();
		
		for(int  i=1; i<=xis.rowCount("MasterTestCases"); i++)
		{
		
		    if(xis.getData("MasterTestCases",i, 2).equalsIgnoreCase("y"))
	     	{
		     String TcModule= xis.getData("MasterTestCases", i, 1);
		     
		     int rowcount=xis.rowCount(TcModule);
		     
		     for(int j=1; j<=rowcount;j++)
		     {
		    	 
		    	 String Description= xis.getData(TcModule,j, 0);
		    	 String ObjectType=xis.getData(TcModule,j, 1);
		    	 String LocatorType=xis.getData(TcModule, j, 2);
		    	 String LocatorValue=xis.getData(TcModule, j, 3);
		    	 String Tesdata=xis.getData(TcModule,j,4);
		    	 
		    	 
		    	 if(ObjectType.equalsIgnoreCase("startBrowser"))
		    			 {
		    		      driver=FunctionLibrary.startBrowser(driver);
		    			 }
		    	
		    	 if(ObjectType.equalsIgnoreCase("openApplication"))
		    			 {
		    		     FunctionLibrary.openApplication(driver);
		    			 }}
		                 
		    		    	
	        }
	  }
	
		}
	}

