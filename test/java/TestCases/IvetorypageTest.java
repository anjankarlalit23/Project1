package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.IvetoryPage;
import Pages.LogiPage;

public class IvetorypageTest extends TestBase {
	IvetoryPage ivtPage;
	LogiPage logi;
	
	
	
	@BeforeMethod
	public void m1() throws Exception
	{
		itilaizatio();
		 ivtPage =new  IvetoryPage();
		 LogiPage logi=  new LogiPage();
		logi.eterUseame();
		logi.eterPassword();
		logi.logibutto();
	}
	
	
	@Test
	public void cartTest() throws Exception
	{
	String result = ivtPage.cart();	
	Assert.assertEquals(result,"2");
		Reporter.log("product added " +result);
	}
	
	
	@AfterMethod
	public void driverClose()
	{
		driver.close();
	}
	
}
