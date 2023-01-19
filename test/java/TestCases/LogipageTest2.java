package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase2;
import Pages.WhatsappPage;

public class LogipageTest2 extends TestBase2 {
	WhatsappPage logi;
@BeforeMethod
public void setup() throws Exception
{
	iitializatio();
	 logi = new WhatsappPage();
	}
	
@Test (enabled = true)

public void logitoAPPTest() throws Exception
{
	logi.logitoAPP();
	Thread.sleep(5000);
}

@Test
public void sortigTest() throws Exception
{    logi.logitoAPP();
	logi.sortSelectPage();
}

@AfterMethod
public void closeBrpwser()
{driver.close();
	}


}
	
	