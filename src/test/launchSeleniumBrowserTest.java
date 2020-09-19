package test;

import selenium.SeleniumWebDriver;
import org.openqa.selenium.WebDriver;

public class launchSeleniumBrowserTest {

	public static void main(String[] args)
	{
		WebDriver driver = SeleniumWebDriver.fireFoxDriver();
		driver.get("https://www.amazon.in");
	}
}
