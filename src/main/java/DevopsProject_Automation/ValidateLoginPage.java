package DevopsProject_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateLoginPage {

	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yessinfotech.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
	
		
		Assert.assertEquals(title, "Software training classes institute in Hadapsar Pune123");
		System.out.println("successfully landing home page");
		
		driver.close();
	}
}
