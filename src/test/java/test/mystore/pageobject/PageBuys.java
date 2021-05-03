package test.mystore.pageobject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PageBuys extends PageObject {

	// 1 Scenario

	@FindBy(xpath = "//input[@id='search_query_top']")
	WebElementFacade inputSearch;

	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")
	WebElementFacade buttonSearch;

	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]")
	WebElementFacade buttonViewDetail;

	@FindBy(xpath = "//span[contains(text(),'More')]")
	WebElementFacade buttonDetailDress;

	@FindBy(xpath = "//h3[contains(text(),'More info')]")
	WebElementFacade messageMore;

	// 2 Scenario

	@FindBy(xpath = "//input[@id='quantity_wanted']")
	WebElementFacade inputCuantityDetail;

	@FindBy(xpath = "//select[@id='group_1']")
	WebElementFacade sizeDetail;

	@FindBy(xpath = "//a[@id='color_14']")
	WebElementFacade colorDetail;

	@FindBy(xpath = "//span[contains(text(),'Add to cart')]")
	WebElementFacade buttonAddCard;

	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]")
	WebElementFacade buttonProceedCheckout;

	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]")
	WebElementFacade buttonProceedCheckoutSummary;

	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/textarea[1]")
	WebElementFacade textAreaCommentsOrder;

	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]")
	WebElementFacade buttonProceedCheckoutAddress;

	@FindBy(xpath = "//label[contains(text(),'I agree to the terms of service and will adhere to')]")
	WebElementFacade checkboxTermsService;

	@FindBy(xpath = "//p[contains(text(),'You must agree to the terms of service before cont')]")
	WebElementFacade modalTermsService;

	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]")
	WebElementFacade buttonProceedCheckoutShipping;

	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/a[1]")
	WebElementFacade buttonPayBank;

	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]")
	WebElementFacade buttonConfirmOrder;

	@FindBy(xpath = "//strong[contains(text(),'Your order on My Store is complete.')]")
	WebElementFacade messageOrderSucessfull;

	// 1 Scenario
	public void enterInputSearch(String search) {
		inputSearch.click();
		inputSearch.clear();
		inputSearch.sendKeys(search);
	}

	public void clickButtonSearch() {
		buttonSearch.click();
	}

	public void clickButtonViewDetailDress() {
		buttonViewDetail.click();
	}

	public void clickButtonDetailDress() {
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		buttonDetailDress.click();

	}

	public void showMessageMore() {
		String current = messageMore.getText();
		String expected = "MORE INFO";
		Assert.assertEquals(expected, current);
	}

	// 2 Scenario

	public void enterCuantityDetail(String cuantityDetail) {
		inputCuantityDetail.click();
		inputCuantityDetail.clear();
		inputCuantityDetail.sendKeys(cuantityDetail);
	}

	public void size() {

		Select size = new Select(sizeDetail);
		size.selectByVisibleText("L");

	}

	public void clickCheckBoxColorDetail() {
		colorDetail.click();
	}

	public void clickButtonAddCard() {
		buttonAddCard.click();
	}

	public void clickButtonProceedCheckout() {
		buttonProceedCheckout.click();
	}

	public void clickButtonProceedCheckoutSummary() {
		buttonProceedCheckoutSummary.click();
	}

	public void enterCommentsOrder(String commentsOrder) {
		textAreaCommentsOrder.click();
		textAreaCommentsOrder.clear();
		textAreaCommentsOrder.sendKeys(commentsOrder);
	}

	public void clickButtonProceedCheckoutAddress() {
		buttonProceedCheckoutAddress.click();
	}

	public void clickCheckboxTermsService() {
		checkboxTermsService.click();
	}

	public void clickButtonProceedCheckoutShipping() {
		buttonProceedCheckoutShipping.click();
	}

	public void clickButtonPayBank() {
		buttonPayBank.click();
	}

	public void clickButtonConfirmOrder() {
		buttonConfirmOrder.click();
	}

	public void messageOrderSucessfull() {
		String current = messageOrderSucessfull.getText();
		String expected = "Your order on My Store is complete.";
		Assert.assertEquals(expected, current);
	}

}
