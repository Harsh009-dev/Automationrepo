package page_Action_demo;

import org.openqa.selenium.WebDriver;

import Test_Runner_Library.BaseClass_demo;
import page_object_demo.Login_demo;

public class Login_demo_PageAction extends Login_demo {

	public Login_demo_PageAction(WebDriver _driver) {
		super(_driver);
	}
	
	static WebDriver driver=BaseClass_demo.getDriver();
	
	public void type_username(String data) {
		enterDataInElement(uname, data);
	}
	
	public void type_pass(String data) {
		enterDataInElement(pswd, data);
	}
	
    public void clickbutton() {
    	clickElement(loginBtn);
    }
	
}
