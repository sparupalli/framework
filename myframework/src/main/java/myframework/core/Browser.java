package myframework.core;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Browser {

	private static WebDriver instance;
	private static final Properties properties = ConfigLoader.loadGlobalProperties();
	private static final String browserId = properties.getProperty("webdriver").toUpperCase().trim();

	private static WebDriver getDriver(){
		if(browserId.equals("FIREFOX")){			
			return new FirefoxDriver();
		}else if (browserId.equals("CHROME")){
			return new ChromeDriver();
		}else if(browserId.equals("IE")){
			return new InternetExplorerDriver();
		}else{
			System.out.println("Browser :"+browserId+" is not supported");
		}
		return null;
	}
	
	public static WebDriver getInstance(){
		if(instance == null){
			instance = getDriver();
			instance.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		}
		return instance;
	}
	
	public void close(){
		Browser.getDriver().close();
	}
	
}
