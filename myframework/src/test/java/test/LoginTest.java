package test;

import myframework.core.BaseTest;
import myframework.core.Pages;

import org.junit.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest{
	
		@Pages
		LoginPage loginPage;
	
		@Test
		public void login_to_application(){
			loginPage.gotoLoginPage("https://env11.yarris.com");
			loginPage.clickLoginLink();
			loginPage.enterUsername("Username Goes Here");
			loginPage.enterPassword("Password Goes here");
			loginPage.clickSubmitButton();
		}

	
}
