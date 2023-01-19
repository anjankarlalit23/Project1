package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase2;
import Utility.Readdata2;

public class WhatsappPage extends TestBase2 {
	
@FindBy(xpath= "//input[@id='user-name']") private WebElement userame;
@FindBy(xpath= "//input[@id='password']") private WebElement password;
@FindBy(xpath= "//input[@id='login-button']") private WebElement logibutto;
@FindBy(xpath = "//select[@class='product_sort_container']") private WebElement sort;

public WhatsappPage()
{PageFactory.initElements(driver, this);
	}

	public void logitoAPP() throws Exception
	{
		userame.sendKeys(Readdata2.readproperty("Userame"));
		password.sendKeys(Readdata2.readproperty("passsword"));
		logibutto.click();
	}
	
	public void sortSelectPage() throws Exception
	{
		Readdata2.sortSelect(sort, "Name (Z to A)");
		Thread.sleep(1000);
		
	}
	
	}
	

