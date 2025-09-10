package DevopsProject_Automation;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class validateHomePage {
	@Test
	public void test1() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yessinfotech.com/");
		
		 
		String title = driver.getTitle();
		System.out.println(title);
		
	
		
		Assert.assertEquals(title, "Software training classes institute in Hadapsar Pune123");
		System.out.println("successfully landing home page");
		
		driver.close();
		
	
	}
}
