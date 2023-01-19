package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LogiPage;

public class LogiPageTest extends TestBase {
	
	LogiPage login;
@BeforeMethod (alwaysRun = true)
	public void setup() throws Exception 
	{
		itilaizatio();
		 login = new LogiPage();
	}
	 

@Test (enabled = true, groups = "saity")

public void verifyTitleTest()
{
	String actulTitle = login.verrifyTitle();	
	String expectTitle = "Swag Labs";
	Assert.assertEquals(actulTitle, expectTitle);
}
@Test (enabled = false)
public void VerryfyURLTest()
{
	String actulURL = login.verrifyURL();	
	String expectURL = "https://www.saucedemo.com/";
	Assert.assertEquals(actulURL, expectURL);
}


@Test (enabled = false)
public void verifylogiLogoTest()
{
	boolean result = login.verifylogiLogo();
Assert.assertEquals(result, true);
}
@Test (enabled = false)
public void verifylogiTBotLogoest()
{
	boolean result = login.verifyBotLogo();
	Assert.assertEquals(result, true);
}
@Test (enabled = false)
public void eterUseameTest() throws Exception
{
	login.eterUseame ();
}
@Test (enabled = true)
public void eterPasswordTest() throws Exception
{
	login.eterPassword ();
}

@Test (enabled = false)
public void logibuttoTest() throws Exception
{
	login.logibutto();
Thread.sleep(2000);
	login.popup();
}

@AfterMethod (alwaysRun = true)
public void closeBrowser() throws Exception
{
	Thread.sleep(5000);
	
	driver.close();

	}
}
