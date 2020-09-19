package selenium;
import org.openqa.selenium.WebDriver;

public interface WebBrowser
{
	abstract WebDriver initateChromeDriver();
	abstract WebDriver initiateFirefoxDriver();
}
