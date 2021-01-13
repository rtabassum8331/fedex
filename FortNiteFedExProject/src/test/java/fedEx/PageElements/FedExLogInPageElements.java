package fedEx.PageElements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class FedExLogInPageElements {
	
	@FindBy(xpath = "//*[@id=\"fxg-dropdown-signIn\"]/span")
	public WebElement SignuporLogin;

	@FindBy(xpath = "//*[@id=\'NavLoginUserId\']")
	public WebElement userid;

	@FindBy(xpath = "//*[@id=\'NavLoginPassword\']")
	public WebElement password;

	@FindBy(xpath = "//*[@id=\'HeaderLogin\']/button")
	public WebElement loginBtn;

	public Object logInLink;

	//public Object logInLink;

	/*
	 * @FindBy(xpath = "//*[@id='__tealiumImplicitmodal']/div/button/span[1]")
	 * public WebElement cookieBanner;
	 * 
	 * @FindBy(xpath = "//*[@id='errorMessages']") public WebElement errorMsg;
	 * 
	 * 
	 * @FindBy(xpath = "//a[@class='acq_main_header_signupLogin']") public
	 * WebElement logInLink;
	 * 
	 * 
	 * @FindAll(@FindBy(xpath = "//a[contains(text(),'Log')]")) public
	 * List<WebElement> logInLink;
	 */
}
