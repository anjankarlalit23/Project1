package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class IvetoryPage extends TestBase{
	
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack") private WebElement bagClick;
	@FindBy(id = "add-to-cart-sauce-labs-bike-light") private WebElement lightClick;
	@FindBy(xpath = "//select[@data-test='product_sort_container']") private WebElement cart;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement productCout;

public IvetoryPage()
{
	PageFactory.initElements(driver, this);}
	

public String cart() throws Exception
{
	Select s = new Select(cart);
	s.selectByVisibleText("Name (Z to A)");
	Thread.sleep(1000);
	bagClick.click();
	lightClick.click();
	return productCout.getText();
	
	}


}