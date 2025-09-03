package DevopsProject_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidateLoginPage {

	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yessinfotech.com/");
		driver.close();
	}
}
