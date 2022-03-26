package yahoo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import yahoo.qa.util.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name="username")
	WebElement username;
	@FindBy(xpath="//input[@id='login-signin']")
	WebElement signin;
		
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
public passwordpage login(String un) {
	username.sendKeys(un);
	signin.click();
	return new passwordpage();
}



}
