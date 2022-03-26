package yahoo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import yahoo.qa.util.TestBase;

public class passwordpage extends TestBase {
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	@FindBy(xpath="//div[@class='icon mail']")
	WebElement Mailicon;

	public passwordpage() {
		PageFactory.initElements(driver, this);
	}

	public Mailpage gotomails(String ps) throws InterruptedException {
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		password.sendKeys(ps);
		submit.click();
		Mailicon.click();
		return new Mailpage();

	}

	
}
