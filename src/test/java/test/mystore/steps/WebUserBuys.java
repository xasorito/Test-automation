package test.mystore.steps;

import net.serenitybdd.core.steps.ScenarioActor;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import test.mystore.pageobject.PageAccount;
import test.mystore.pageobject.PageBuys;
import test.mystore.pageobject.PageSignIn;

public class WebUserBuys extends ScenarioActor {

	Actor actor = Actor.named("Catalina");

	@Steps(shared = true)
	PageBuys pageBuys;

	@Steps(shared = true)
	PageSignIn pageSignIn;

	@Steps(shared = true)
	PageAccount pageCreateFormAccount;

	// 1 Scenario

	@Step("#actor ingresa a la pagina principal del sitio web")
	public void ingresaASitioWeb() {
		pageCreateFormAccount.setDefaultBaseUrl("http://automationpractice.com/index.php");
		pageCreateFormAccount.open();
	}

	@Step("#actor search for the dress")
	public void searchDress() {
		pageBuys.enterInputSearch("Printed Summer Dress");
		pageBuys.clickButtonSearch();

	}

	@Step("#actor see detail for dress")
	public void detailViewDress() {
		pageBuys.clickButtonViewDetailDress();
		pageBuys.clickButtonDetailDress();
		pageBuys.showMessageMore();
	}

	// 2 Scenario
	@Step("#actor select  cuantity, size, color and comment order")
	public void selectDetails() {
		pageBuys.enterCuantityDetail("3");
		pageBuys.size();
		pageBuys.clickCheckBoxColorDetail();
		pageBuys.clickButtonAddCard();
		pageBuys.clickButtonProceedCheckout();
		pageBuys.clickButtonProceedCheckoutSummary();
		pageBuys.enterCommentsOrder("Please be careful with the order");
	}

	@Step("#actor accepts the terms and conditions and selects the payment method and confirms the order")
	public void confirmTermsConditionAndPaymentMethodAndConfirmOrder() {
		pageBuys.clickButtonProceedCheckoutAddress();
		pageBuys.clickCheckboxTermsService();
		pageBuys.clickButtonProceedCheckoutShipping();
		pageBuys.clickButtonPayBank();
		pageBuys.clickButtonConfirmOrder();
		pageBuys.messageOrderSucessfull();
	}
}
