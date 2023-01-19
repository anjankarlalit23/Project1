package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.Read_Data;

public class LogiPage extends TestBase{
	
	@FindBy(xpath="//input[@data-test='login-button']") private WebElement logiButto;
	

	@FindBy(xpath="//input[@type='text']") private WebElement userame;
	@FindBy(xpath="//input[@type='password']") private WebElement passWord;
	
	
	
	@FindBy(xpath="//div[@class='login-box']") private WebElement logiLogo;
	@FindBy(xpath="//div[@class='bot_column']") private WebElement BotLogo;

	public LogiPage()
	{
		PageFactory.initElements(driver, this);
		}
	public boolean verifylogiLogo()
	{
		return logiLogo.isDisplayed();
	}
	public boolean verifyBotLogo()
	{
		return logiLogo.isDisplayed();
	}
	
public void eterUseame () throws Exception
{
	userame.sendKeys(Read_Data.readPropertyFile("Userame"));
}
public void eterPassword () throws Exception
{
//	passWord.sendKeys(Read_Data.readPropertyFile("Password"));
	passWord.sendKeys(Read_Data.readExcelSheet(1,1));
}


public void popup()
{
	Alert alt = driver.switchTo().alert();
	alt.accept();
}


public void logibutto ()
{
	logiButto.click();
}
public String verrifyTitle()
{
	return driver.getTitle();
	
}
public String verrifyURL()
{
	return driver.getCurrentUrl();
	
}}


