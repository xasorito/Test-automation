package test.mystore.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.mystore.steps.*;

public class StepDefinitionsAccount {

	@Steps(shared = true)

	WebUserAccount user;

	// 1 scenario Create Account

	@Given("^Catalina enter my store website$")
	public void goToWebSite() {
		user.goToWebsite();
	}

	@When("^Catalina enter the option sign in")
	public void enterOptionSignIn() {
		user.enterSignIn();

	}

	@And("^Catalina click the button for create account$")
	public void createAccount() {
		user.enterEmail();
		user.createAccount();
	}

	@Then("Catalina should be able to enter data in the form and see account created$")
	public void enterDataAndSeeAccountCreated() {
		user.enterForm();
		user.seeAccount();

	}

	//// 2 scenario Enter an invalid email and see the error message

	@When("^Catalina enters the option sign in and enters an invalid email$")
	public void enterSigInAndEnterInvalidEmail() {
		user.enterSignIn();
		user.enterInvalidEmail();
	}

	@Then("Catalina should be able to see an error message$")
	public void showErrorMessaggeInvalidAddress() {
		user.createAccount();
		user.showErrorAccount();
	}

	// 3 scenario Password Recovery

	@When("^Catalina select the button forgot your password$")
	public void selectButtonForgotPassword() {
		user.enterSignIn();
		user.selectForgotPassword();
		user.writeForgotPassword();

	}

	@Then("^Catalina could see the message that the password is reset$")
	public void sucessRecovery() {
		user.recoveryPasswordSucessfull();

	}

	// 4 scenario Login
	
	@And("^Catalina enter the username and password$")
	public void enterUsernameAndPassword() {
		user.enterUsernamePassword();
	}

	@Then("^Catalina successfully login$")
	public void sucessfullyLogins() {
		user.seeAccount();
	}

}
