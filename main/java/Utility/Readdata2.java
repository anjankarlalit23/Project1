package Utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Readdata2 {
	
	public static String readproperty( String value) throws Exception
	{
		Properties p = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\ADMI\\eclipse-workspace\\ProjectSept2022\\test Data\\cofig.properties2");
		p.load(file);
		return p.getProperty(value);
	}
	
	public static void sortSelect(WebElement ele, String optio)
	{
		Select s= new Select(ele);
		s.selectByVisibleText(optio);
	}

}
