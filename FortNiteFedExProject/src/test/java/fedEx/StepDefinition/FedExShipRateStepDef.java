package fedEx.StepDefinition;

import fedEx.PageActions.FedExShipRateActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FedExShipRateStepDef {

	FedExShipRateActions ShipRateActions=new FedExShipRateActions();
	
	@Given("User in on the FedEx home page")
	public void user_in_on_the_FedEx_home_page() {
	ShipRateActions.fedExHomePage();   
	    
	}

	@When("User clicks on Rate & Ship")
	public void user_clicks_on_Rate_Ship() {
	    
	    
	}

	@When("Clicks on From")
	public void clicks_on_From() {
	    
	    
	}

	@When("Selects To")
	public void selects_To() {
	    
	    
	}

	@When("Selects checkbox")
	public void selects_checkbox() {
	    
	    
	}

	@When("Selects packaging option from drop-down list.")
	public void selects_packaging_option_from_drop_down_list() {
	    
	    
	}

	@When("Selects lb from drop-down list")
	public void selects_lb_from_drop_down_list() {
	    
	    
	}

	@When("Selects number of packages from drop-down list")
	public void selects_number_of_packages_from_drop_down_list() {
	    
	    
	}

	@When("Inserts length weight height per packagee")
	public void inserts_length_weight_height_per_packagee() {
	    
	    
	}

	@When("Inserts number of dimensions per package")
	public void inserts_number_of_dimensions_per_package() {
	    
	    
	}

	@When("Selects ship-date from drop-down list")
	public void selects_ship_date_from_drop_down_list() {
	    
	    
	}

	@When("Click Show Rates")
	public void click_Show_Rates() {
	    
	    
	}

	@Then("FedEx Retails rates shows")
	public void fedex_Retails_rates_shows() {
	    
	    
	}
}
