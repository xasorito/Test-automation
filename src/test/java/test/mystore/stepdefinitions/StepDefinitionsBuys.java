package test.mystore.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.mystore.steps.*;

public class StepDefinitionsBuys {

	@Steps(shared = true)

	WebUserBuys user;

	// 1 scenario

	@When("^Catalina search for the dress$")
	public void searchDress() {
		user.searchDress();
	}

	@Then("^Catalina see view detail for dress$")
	public void detailViewDress() {
		user.detailViewDress();
	}

	// 2 Scenario

	@And("^Catalina select  cuantity, size, color and comment order$")
	public void selectDetails() {

		user.selectDetails();

	}

	@Then("^Catalina accepts the terms and conditions and selects the payment method and confirms the order$")
	public void confirmTermsConditionAndPaymentMethodAndConfirmOrder() {

		user.confirmTermsConditionAndPaymentMethodAndConfirmOrder();

	}
}
