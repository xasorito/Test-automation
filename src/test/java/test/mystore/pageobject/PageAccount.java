package test.mystore.pageobject;

import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")
public class PageAccount extends PageObject {

	@FindBy(name = "id_gender")
	WebElementFacade radioButtonGender;

	@FindBy(id = "customer_firstname")
	WebElementFacade inputFirstName;

	@FindBy(id = "customer_lastname")
	WebElementFacade inputLastName;

	//

	@FindBy(id = "passwd")
	WebElementFacade inputPassword;
	//

	@FindBy(id = "address1")
	WebElementFacade inputAddress;

	@FindBy(id = "city")
	WebElementFacade inputCity;

	//

	@FindBy(id = "id_state")
	WebElementFacade state;

	@FindBy(xpath = "//option[contains(text(),'Colorado')]")
	WebElementFacade estadoColorado;

	@FindBy(id = "postcode")
	WebElementFacade inputPostalCode;

	//

	@FindBy(id = "phone_mobile")
	WebElementFacade inputPhone;

	@FindBy(id = "alias")
	WebElementFacade alias;

	@FindBy(id = "submitAccount")
	WebElementFacade buttonRegister;

	@FindBy(xpath = "//h1[@class='page-heading']")
	WebElementFacade accountCreated;

	@FindBy(xpath = "//a[@class='login']")
	WebElementFacade botonSignIn;

	// Recovery Password
	@FindBy(xpath = "//a[contains(text(),'Forgot your password?')]")
	WebElementFacade buttonForgotPassword;

	@FindBy(xpath = "//input[@id='email']")
	WebElementFacade buttonEmailPassword;

	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/p[1]/button[1]")
	WebElementFacade buttonRetrievePassword;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/p[1]")
	WebElementFacade messageRetrieve;

	// Login
	@FindBy(xpath = "//input[@id='email']")
	WebElementFacade buttonEmailAddress;

	@FindBy(xpath = "//input[@id='passwd']")
	WebElementFacade buttonPassword;

	@FindBy(xpath = "//button[@id='SubmitLogin']")
	WebElementFacade buttonSignIn;

	private String forgotPassword2;

	// Scenario 1 Create Account

	public void entrarSignIn() {
		botonSignIn.click();
	}

	public void gender() {
		radioButtonGender.click();

	}

	public void firstName(String firstName) {
		inputFirstName.click();
		inputFirstName.clear();
		inputFirstName.sendKeys(firstName);

	}

	public void lastName(String lastName) {
		inputLastName.click();
		inputLastName.clear();
		inputLastName.sendKeys(lastName);

	}

	public void password(String password) {
		inputPassword.click();
		inputPassword.clear();
		inputPassword.sendKeys(password);

	}

	public void address(String address) {
		inputAddress.click();
		inputAddress.clear();
		inputAddress.sendKeys(address);

	}

	public void city(String city) {
		inputCity.click();
		inputCity.clear();
		inputCity.sendKeys(city);

	}

	public void state() {

		Select day = new Select(state);
		day.selectByVisibleText("Texas");

	}

	public void postalCode(String postalCode) {

		inputPostalCode.click();
		inputPostalCode.clear();
		inputPostalCode.sendKeys(postalCode);

	}

	public void phone(String phone) {

		inputPhone.click();
		inputPhone.clear();
		inputPhone.sendKeys(phone);

	}

	public void alias(String apodo) {
		alias.click();
		alias.clear();
		alias.sendKeys(apodo);

	}

	public void register() {
		buttonRegister.click();

	}

	public void accountCreated() {
		String current = accountCreated.getText();
		String expected = "MY ACCOUNT";
		Assert.assertEquals(expected, current);

	}

	// Scenario 3 Password Recovery
	public void forgotPassword() {
		buttonForgotPassword.click();
	}

	public void writeEmailPassword(String forgotPassword, String forgotPassword2) {
		buttonEmailPassword.click();
		buttonEmailPassword.sendKeys(forgotPassword);
		this.forgotPassword2 = forgotPassword;
		System.out.println(forgotPassword);
	}

	public void clickButtonRetrievePassword() {
		buttonRetrievePassword.click();
	}

	public void sucessRecovery() {
		String current = messageRetrieve.getText();
		String expected = "A confirmation email has been sent to your address: " + this.forgotPassword2;
		Assert.assertEquals(expected, current);
	}

	// Scenario 4 Login
	
	public void enterEmailAddress(String emailAddress) {
		buttonEmailAddress.sendKeys(emailAddress);

	}

	public void enterPassword(String password) {

		buttonPassword.sendKeys(password);
	}

	public void clickButtonSignIn() {

		buttonSignIn.click();
	}
}
