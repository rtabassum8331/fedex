package fedEx.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import fedEx.PageElements.FedExLogInPageElements;
import fedEx.PageElements.FedExShipRateElements;
import fedEx.utilities.SetupDrivers;



public class FedExLoginActionPage {
	
	FedExLogInPageElements fedexLoginElements = null;

	public FedExLoginActionPage () {
		this.fedexLoginElements = new FedExLogInPageElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, fedexLoginElements);

	}

	public void getFedexHomepage() {
		SetupDrivers.chromeDriver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public boolean verifyHomepage() {
		boolean bool = false;
		System.out.println(SetupDrivers.chromeDriver.getTitle());

		if (SetupDrivers.chromeDriver.getTitle().contains("FedEx")) {
			bool = true;
		}

		return bool;
	}

	/*
	 * public void clickLoginLink() {
	 * System.out.println("Number of Elements found: " +
	 * fedexLoginElements.logInLink.size());
	 * fedexLoginElements.logInLink.get(0).click(); //
	 * fedexLoginElements.logInLink.click(); }
	 */

	/*
	 * public boolean verifyLoginpage() { boolean bool = false;
	 * System.out.println("Login Page Title: " +
	 * SetupDrivers.chromeDriver.getTitle()); if
	 * (SetupDrivers.chromeDriver.getTitle().equals("Login | UPS - United States")){
	 * bool = true; }
	 * 
	 * return bool; }
	 */

	/*
	 * public void handleCookieBanner() { fedexLoginElements.cookieBanner.click(); }
	 */
	
	public void SignuporLogin() {
		fedexLoginElements.SignuporLogin.click();
	}

	public void inputUserName(String username) {
		fedexLoginElements.userid.sendKeys(username);
	}

	public void inputPassword(String password) {
		fedexLoginElements.password.sendKeys(password);
	}

	public void clickLoginBtn() {
		fedexLoginElements.loginBtn.click();
	}
	
	
	/*
	 * public String loginErrorMsg() { String msg = null;
	 * 
	 * try {
	 * 
	 * msg = fedexLoginElements.errorMsg.getText();
	 * 
	 * } catch (Exception e) { System.out.println("Error message not displayed!"); }
	 * 
	 * return msg; }
	 */
	

}



	

	

