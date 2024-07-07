package page_object_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Test_Runner_Library.BaseClass_demo;
import common_Method_Library.Common_Method_demo;

public class Radio_button_PO extends Common_Method_demo {
    static WebDriver driver=BaseClass_demo.getDriver();
	public Radio_button_PO(WebDriver _driver) {
		super(_driver);
	}
	
	public By radioButton=By.xpath("//label[@for='yesRadio']");
	
}
