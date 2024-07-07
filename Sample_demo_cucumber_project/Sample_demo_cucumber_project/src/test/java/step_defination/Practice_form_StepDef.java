package step_defination;

import Test_Runner_Library.BaseClass_demo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Action_demo.Practice_form_PA;

public class Practice_form_StepDef {
	
	Practice_form_PA pfa=new Practice_form_PA(BaseClass_demo.getDriver());
	
	@Given("^I launch browser as \"(.*)\" and nevigate to url as \"(.*)\"$")
		public void i_have_launch_browser_and_nevigate_to_url(String choice,String url) {
		pfa.LaunchBrowser(url,choice);
	}
	
	@When("^I Enter first name as \"(.*)\"$")
		public void ienterfirstnameandlastname(String data) {
		pfa.enterFirstName(data);
	}
	
	@And("^I Enter Last name as \"(.*)\"$")
		public void ienterlastname(String data)
	{
		pfa.enterLastName(data);
	}
	
	@Then("^I Enter Email address as \"(.*)\"$")
		public void ienteremailaddress(String data) {
		pfa.enterEmailAddress(data);
	}
	
	@Then("^I click Female radio button$")
		public void iclikfemaleradiobutton() {
		pfa.selectFemale();
	}
	
	@Then("^I Enter Phone Number as \"(.*)\"$")
		public void ienterphonenumber(String data) {
		pfa.enterphonenumber(data);
		
	}
	
	@Then("^I click date of birth$")
		public void iclickdateofbirth() {
		pfa.clickBirthday();
	}
	
	@And("^I select date as \"(.*)\" and I select month as \"(.*)\" and I select year as \"(.*)\"$")
		public void iselectyearmonthanddate(String date,String month,String year) {
		pfa.clickbirthyear(year);
		pfa.clickmonth(month);
		pfa.clickdate(date, month);
	}
	
	@Then("^I select hobbies$")
		public void iselecthobbies() {
		pfa.checkHobby1();
		pfa.checkHobby2();
		
	}
	
	/*@Then("^I choose picture$")
	public void ichoosepictureas() 
	{
		pfa.choosepicture();
	}*/
	
	@When("^Click dropdown button And Select NCR$")
	public void clickdropdown_andselectncr() {
		pfa.dropdownandselectoption1();
	}
	
	@Then("^Select another dropdown and select Noida$")
	public void selectanotherdropdown_andselectnoida()
	{
		pfa.dropdownandselectoption2();
	}
	
	@Then("^I quit browser$")
	public void iquitbrowser() {
	   
	}

}
