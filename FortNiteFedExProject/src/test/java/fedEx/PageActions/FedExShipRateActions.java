package fedEx.PageActions;

import org.openqa.selenium.support.PageFactory;

import fedEx.PageElements.FedExShipRateElements;
import fedEx.utilities.SetupDrivers;

public class FedExShipRateActions {

	FedExShipRateElements ShipRate;
	
	public FedExShipRateActions(){
		this.ShipRate=new FedExShipRateElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, ShipRate);
	}
	
	public void fedExHomePage() {
		SetupDrivers.chromeDriver.get("https://www.fedex.com/en-us/home.html");
	}
}
