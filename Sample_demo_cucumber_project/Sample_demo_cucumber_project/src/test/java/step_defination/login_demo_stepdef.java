package step_defination;

import Test_Runner_Library.BaseClass_demo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Action_demo.Login_demo_PageAction;

public class login_demo_stepdef {
	
	Login_demo_PageAction ldp= new Login_demo_PageAction(BaseClass_demo.getDriver());
	 
	@Given("^I have launch browser \"(.*)\" and nevigate to url \"(.*)\"$")
	public void i_have_launch_browser_and_nevigate_to_url(String choice,String url) {
		ldp.LaunchBrowser(url,choice);
	}
	
	@When("^I have type username as \"(.*)\"$")
	public void i_have_type_username_as(String username) 
	{
		ldp.type_username(username);
	}
	
	@And("^I have type password as \"(.*)\"$")
	public void i_have_type_password_as(String pass) 
	{
		ldp.type_pass(pass);
	}
	
	@Then("^I have click login button$")
	public void i_have_click_login_button()
	{
		ldp.clickbutton();
	}

	
}
