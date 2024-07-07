package page_Action_demo;

import org.openqa.selenium.WebDriver;

import Test_Runner_Library.BaseClass_demo;
import page_object_demo.Radio_button_PO;

public class Radio_button_PA extends Radio_button_PO{
	
	public Radio_button_PA(WebDriver _driver) {
		super(_driver);
	}

	static WebDriver driver=BaseClass_demo.getDriver();

	public void radiobutoonclikyes() {
		scrolltillelement(radioButton);
		clickElement(radioButton);
		
	}
	public void nevigatetodropdownurl(String url) {
		getDriver().get("https://demoqa.com/automation-practice-form");
	}
	
	
	
	
	
	
}
