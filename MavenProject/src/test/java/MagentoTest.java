import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest {

	@Test
	public void credentials() {
		
		System.setProperty("webdriver.chrome.driver", "/home/koolhussain/Jar Files/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.magento.com");

		Home home = new Home(driver);
		home.clickOnMyAccount();

		Login login = new Login(driver);
		login.typeEmail("nitinmanjunath1991@gmail.com");
		login.typePassword("Welcome123");
		login.clickOnLogin();

		Logout logout = new Logout(driver);
		logout.clickOnLogout();

		driver.quit();
	}

}
