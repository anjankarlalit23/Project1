package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Read_Data;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	static  public WebDriver driver; //static - to use driver multiple time and at multiple class and packages
	public void itilaizatio() throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Read_Data.readPropertyFile("URL"));
//	driver.get("https://www.saucedemo.com/");
		

	
}
	
	}
	