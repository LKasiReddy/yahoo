package StepDefinitions;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import yahoo.qa.pages.LoginPage;
import yahoo.qa.pages.Mailpage;
import yahoo.qa.pages.passwordpage;
import yahoo.qa.util.TestBase;
import yahoo.qa.util.TestUtil;

public class loginstepdefinitions extends TestBase {
	LoginPage loginpage;
	passwordpage password;
	Mailpage mail;
	
	@Given("^launch the application$")
	public void launch_the_application() {
		TestBase.initialization();
		}
	@When("^Enter the username and Click$")
	public void enter_the_username_and_click() {
		loginpage = new LoginPage();
		password= loginpage.login(prop.getProperty("username"));
		
	}

	@When("^Enter the passeord and Click$")
	public void enter_the_passeord_and_click() throws InterruptedException {
		password = new passwordpage();
		mail = password.gotomails(prop.getProperty("password"));
	}


	
}
