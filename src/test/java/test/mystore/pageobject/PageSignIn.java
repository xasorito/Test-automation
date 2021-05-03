package test.mystore.pageobject;

import org.junit.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PageSignIn extends PageObject {

	@FindBy(xpath = "//input[@id='email_create']")
	WebElementFacade inputEmail;

	@FindBy(id = "SubmitCreate")
	WebElementFacade buttonCreateAccount;

	@FindBy(id = "create_account_error")
	WebElementFacade errorMessage;

	// Scenario 2 Enter an invalid email and see the error message
	public void enterEmail(String mail) {
		inputEmail.click();
		inputEmail.clear();
		inputEmail.sendKeys(mail);
	}

	public void createAccount() {
		buttonCreateAccount.click();

	}

	public void showErrorValidationEmail() {
		String current = errorMessage.getText();
		String expected = "Invalid email address.";
		Assert.assertEquals(expected, current);
	}
}
