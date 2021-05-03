package test.mystore.steps;

import net.serenitybdd.core.steps.ScenarioActor;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import test.mystore.pageobject.PageAccount;
import test.mystore.pageobject.PageSignIn;

public class WebUserAccount extends ScenarioActor {

	Actor actor = Actor.named("Catalina");

	@Steps(shared = true)
	PageSignIn pageSignIn;

	@Steps(shared = true)
	PageAccount pageCreateFormAccount;

	//// 1 Scenario Create Account

	@Step("#actor go to the main page of the website")
	public void goToWebsite() {
		pageCreateFormAccount.setDefaultBaseUrl("http://automationpractice.com/index.php");
		pageCreateFormAccount.open();
	}

	@Step("#actor enter by the option sign in")
	public void enterSignIn() {
		pageCreateFormAccount.entrarSignIn();
	}

	@Step("#actor enter email address")
	public void enterEmail() {
		pageSignIn.enterEmail("santrix1524@pruebaauto.com");
	}

	@Step("#actor enter form data")
	public void enterForm() {
		pageCreateFormAccount.gender();
		pageCreateFormAccount.firstName("Sandra");
		pageCreateFormAccount.lastName("Londono");
		pageCreateFormAccount.password("123456");
		pageCreateFormAccount.address("cll. 26 # 94 - 13");
		pageCreateFormAccount.city("Bogota");
		pageCreateFormAccount.state();
		pageCreateFormAccount.postalCode("11011");
		pageCreateFormAccount.phone("312467890");
		pageCreateFormAccount.alias("Compras");
		pageCreateFormAccount.register();
	}

	@Step("#actor request account creation")
	public void createAccount() {
		pageSignIn.createAccount();
	}

	@Step("#actor see account created")
	public void seeAccount() {
		pageCreateFormAccount.accountCreated();
	}
	// Scenario 2 Enter an invalid email and see the error message

	@Step("#actor Enter invalid email address")
	public void enterInvalidEmail() {
		pageSignIn.enterEmail("testinvalid123");
	}

	@Step("#actor request invalid account ")
	public void createInvalidAccount() {
		pageSignIn.createAccount();
	}

	@Step("#actor show error message")
	public void showErrorAccount() {
		pageSignIn.showErrorValidationEmail();
	}

	//// 3 Scenario Password Recovery

	@Step("#actor select button forgot password")
	public void selectForgotPassword() {
		pageCreateFormAccount.forgotPassword();
	}

	@Step("#actor write email password and select button retrive")
	public void writeForgotPassword() {
		pageCreateFormAccount.writeEmailPassword("santrix1518@pruebaauto.com", null);
		pageCreateFormAccount.clickButtonRetrievePassword();
	}

	@Step("#actor catalina could see the message that the password is reset")
	public void recoveryPasswordSucessfull() {
		pageCreateFormAccount.sucessRecovery();
	}

	// 4 Scenario Login
	@Step("#actor Catalina enter the username and password")
	public void enterUsernamePassword() {
		pageCreateFormAccount.enterEmailAddress("santrix1518@pruebaauto.com");
		pageCreateFormAccount.enterPassword("123456");
		pageCreateFormAccount.clickButtonSignIn();
	}

}
