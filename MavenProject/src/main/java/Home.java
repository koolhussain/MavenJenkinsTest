import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author koolhussain
 *
 */
public class Home {
	By myacc = By.linkText("My Account");
	WebDriver driver;
	
	public Home(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void clickOnMyAccount() {
		driver.findElement(myacc).click();
	}
}