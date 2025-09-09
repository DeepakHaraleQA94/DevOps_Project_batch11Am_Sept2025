package DevopsProject_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class validateHomePage {
	@Test
	public void test1() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yessinfotech.com/");
		driver.close();
		System.out.println("Hi");
	}
}
