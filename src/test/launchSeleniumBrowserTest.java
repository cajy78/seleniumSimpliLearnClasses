package test;

import selenium.SeleniumWebDriver;
import org.openqa.selenium.WebDriver;

public class launchSeleniumBrowserTest {

	public static void main(String[] args)
	{
		SeleniumWebDriver d = new SeleniumWebDriver();
		WebDriver driver = d.initiateFirefoxDriver();
		driver.get("https://www.amazon.in");
		driver = d.initateChromeDriver();
		driver.get("https://www.amazon.in");
	}
}
