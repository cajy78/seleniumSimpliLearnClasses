package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebDriver {

	private static WebDriver driver;
	
	public static WebDriver chromeDriver()
	{
		System.setProperty("webdriver.chrome.driver","/Users/cajetanfernandes/Project Resources/Java Project Resouces/chromedriver");
		ChromeOptions cmo = new ChromeOptions();
		cmo.addArguments("start-maximized");
		driver = new ChromeDriver(cmo);
		return driver;
	}
	
	public static WebDriver fireFoxDriver()
	{
		System.setProperty("webdriver.gecko.driver","/Users/cajetanfernandes/Project Resources/Java Project Resouces/geckodriver");
		driver = new FirefoxDriver();
		return driver;
	}
}
