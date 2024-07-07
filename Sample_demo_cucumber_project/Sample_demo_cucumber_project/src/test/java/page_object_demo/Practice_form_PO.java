package page_object_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Test_Runner_Library.BaseClass_demo;
import common_Method_Library.Common_Method_demo;

public class Practice_form_PO extends Common_Method_demo{
	static WebDriver driver=BaseClass_demo.getDriver();

	public Practice_form_PO(WebDriver _driver) {
		super(_driver);
	}
	
	public By fname=By.id("firstName");
	public By lname=By.id("lastName");
	public By emailAddress=By.xpath("//input[@id='userEmail']");
	public By gender=By.xpath("//label[@class='custom-control-label' and text()='Female']");
	public By phoneNo=By.xpath("//input[@id='userNumber']");
	public By birthday=By.id("dateOfBirthInput");
	public By birthyear=By.xpath("//select[contains(@class,'year')]");
	public By birthmonth=By.xpath("//select[contains(@class,'month')]");
	
	public By dateValue(String date, String month) {
		// TODO Auto-generated method stub
		return By.xpath("//div[text()='"+date+"' and contains(@aria-label,'"+month+"')]");
	}
	
	public By hobby1=By.xpath("//input[@id='hobbies-checkbox-1']//following-sibling::label[contains(@class,'label')]");
	public By hobby2=By.xpath("//input[@id='hobbies-checkbox-3']//following-sibling::label[contains(@class,'label')]");
	//public By choosepic=By.xpath("//input[@id='uploadPicture']");
	public By dropdownbutton1=By.xpath("//label[@id='stateCity-label']//parent::div//following-sibling::div//div[@id='state']");
    public By selectdropdownoption1=By.xpath("//div[@id='react-select-3-option-0']");
    public By dropdownbutton2=By.xpath("//label[@id='stateCity-label']//parent::div//following-sibling::div//div[@id='city']");
    public By selectdropdownoption2=By.xpath("//div[@id='react-select-4-option-2']");
}
