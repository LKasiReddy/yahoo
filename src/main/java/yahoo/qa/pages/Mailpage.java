package yahoo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import yahoo.qa.util.TestBase;

public class Mailpage extends TestBase {

	
	@FindBy(xpath="//input[@type='password']")
	WebElement password1;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit1;
	@FindBy(xpath="//div[@class='icon mail']")
	WebElement Mailicon1;

	public Mailpage() {
		PageFactory.initElements(driver, this);
	}

}
