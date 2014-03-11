package pages;

import myframework.core.Browser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(linkText="Login")
	private WebElement loginLink;
	
	@FindBy(id = "username")
	private WebElement userName;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(name = "submit")
	private WebElement submitButton;
	
	public void gotoLoginPage(String url){
		Browser.getInstance().get(url);
	}
	
	public void clickLoginLink(){
		loginLink.click();
	}
	
	public void enterUsername(String username){
		userName.sendKeys(username);
	}
	
	public void enterPassword(String pwd){
		password.sendKeys(pwd);
	}
	
	public void clickSubmitButton(){
		submitButton.click();
	}
}
