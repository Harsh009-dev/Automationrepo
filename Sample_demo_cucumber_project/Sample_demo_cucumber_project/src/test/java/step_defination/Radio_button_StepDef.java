package step_defination;

import Test_Runner_Library.BaseClass_demo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Action_demo.Radio_button_PA;

public class Radio_button_StepDef {
	
	Radio_button_PA rba=new Radio_button_PA(BaseClass_demo.getDriver());
	
	@Given("^I hit browser \"(.*)\" and nevigate to url \"(.*)\"$")
	public void i_hit_browser_and_nevigate_to(String choice,String url)
	{
		rba.LaunchBrowser(url, choice);
		
	}
	
	@When("^I click yes$")
		public void i_click_yes()
		{
		  rba.radiobutoonclikyes();
	    }
 	
	@Given("^Nevigate to page \"(.*)\"$")
	public void nevigate_to_page(String url)
	{
         rba.nevigatetodropdownurl(url);
	}
	
	
}