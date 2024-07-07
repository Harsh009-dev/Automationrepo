package page_Action_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Test_Runner_Library.BaseClass_demo;
import io.netty.handler.codec.http.multipart.FileUpload;
import page_object_demo.Practice_form_PO;

public class Practice_form_PA extends Practice_form_PO{
	static WebDriver driver=BaseClass_demo.getDriver();

	public Practice_form_PA(WebDriver _driver) {
		super(_driver);
	}
	
	public void enterFirstName(String data) {
		enterDataInElement(fname, data);
	}
	
	public void enterLastName(String data) {
		enterDataInElement(lname, data);
	}

	public void enterEmailAddress(String data)
	{
		enterDataInElement(emailAddress, data);
	}
	
	public void selectFemale() {
		scrolltillelement(gender);
		clickElement(gender);
	}
	
	public void enterphonenumber(String data)
	{
	   enterDataInElement(phoneNo, data);	
	}
	
	public void clickBirthday() {
		clickElement(birthday);
	}
	
	public void clickbirthyear(String year) {
		selectDropDownValueUsing(birthyear, "visibletext", 0, null, year);
	}
	
	public void clickmonth(String month) {
		selectDropDownValueUsing(birthmonth, "visibletext", 0, null, month);
	}
	
	public void clickdate(String date,String month) {
		clickElement(dateValue(date,month));
		
	}
	
	public void checkHobby1()
	{
		clickElement(hobby1);
	}
	public void checkHobby2()
	{
		clickElement(hobby2);
	}
	
	//public void choosepicture() {
	//	clickElement(choosepic);
	 //   enterDataInElement(choosepic,"/F:/Mobile/Download/IMG_8342.jpg");
	//}
	
	public void dropdownandselectoption1() {
		scrolltillelement(dropdownbutton1);
		clickElement(dropdownbutton1);
		clickElement(selectdropdownoption1);
	}
	
	public void dropdownandselectoption2() {
		clickElement(dropdownbutton2);
		clickElement(selectdropdownoption2);
	
	}
	
}
