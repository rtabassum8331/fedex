package fedEx.StepDefinition;

import fedEx.PageActions.FedExLoginActionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FedexLoginStepDef {
	
	FedExLoginActionPage loginAction = new FedExLoginActionPage();
	
	@Given("Customer land on Fedex Homepage")
	public void customer_land_on_Fedex_Homepage() {
		 loginAction.getFedexHomepage();
		 loginAction.verifyHomepage();

	}

	@When("customer clicks on Signup or login")
	public void customer_clicks_on_Signup_or_login() {
		 loginAction.SignuporLogin();

	}

	@When("customer put UserId {string}")
	public void customer_put_UserId(String userid) {
		loginAction.inputUserName(userid);
		

	}

	@When("Customer put Password {string}")
	public void customer_put_Password(String password) {
		loginAction.inputPassword(password);

	}

	@Then("Customer able to Login Successfully")
	public void customer_able_to_Login_Successfully() {
		loginAction.clickLoginBtn();
		

	}

}
