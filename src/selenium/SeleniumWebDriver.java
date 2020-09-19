package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebDriver implements WebBrowser{

	private static WebDriver driver;
	
	/*
	 * public static WebDriver chromeDriver() {
	 * 
	 * return driver; }
	 * 
	 * public static WebDriver fireFoxDriver() { return driver; }
	 */

	@Override
	public WebDriver initateChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver","/Users/cajetanfernandes/Project Resources/Java Project Resouces/chromedriver");
		ChromeOptions cmo = new ChromeOptions();
		cmo.addArguments("start-maximized");
		driver = new ChromeDriver(cmo);
		return driver;
	}

	@Override
	public WebDriver initiateFirefoxDriver()
	{
		System.setProperty("webdriver.gecko.driver","/Users/cajetanfernandes/Project Resources/Java Project Resouces/geckodriver");
		driver = new FirefoxDriver();
		return driver;
	}
}
