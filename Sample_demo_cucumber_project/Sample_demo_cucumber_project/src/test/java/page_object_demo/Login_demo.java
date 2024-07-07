package page_object_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Test_Runner_Library.BaseClass_demo;
import common_Method_Library.Common_Method_demo;

public class Login_demo extends Common_Method_demo {

	public Login_demo(WebDriver _driver) {
		super(_driver);
	}
	
	static WebDriver driver=BaseClass_demo.getDriver();
	
	public By uname = By.xpath("//input[@name='username']"); 
	public By pswd = By.xpath("//input[@type='password']");
	public By loginBtn = By.xpath("//button[@type='submit']");

}
