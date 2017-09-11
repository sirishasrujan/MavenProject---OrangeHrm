package CommonFuctionLibrary;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Utilities.PropertyFileUtil;

public class FunctionLibrary {

	public static WebDriver startBrowser(WebDriver driver ) throws Exception, IOException {
		
		
          if(PropertyFileUtil.getValueForKey("Browser").equalsIgnoreCase("firefox")) {
						
			
			driver=new FirefoxDriver();
			
		}
		
		if(PropertyFileUtil.getValueForKey("Browser").equalsIgnoreCase("chrome")) {
						
			
			System.setProperty("webdriver.chrome.driver", "./CommonjarFiles/chromedriver.exe");
			    driver= new ChromeDriver();

		}

	  
			return driver;
		
	}
	
	  public static  void openApplication(WebDriver driver) throws FileNotFoundException, IOException
	  {
		  
		  driver.manage().window().maximize();
		  driver.get(PropertyFileUtil.getValueForKey("url"));
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
}
