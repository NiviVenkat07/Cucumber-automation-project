package Step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Automation_runner.Test_runner_Auto;
import Base_class_for_all.Base_class;
import Page_Object_Manager_Automation.Page_object_manager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_def extends Base_class {
	
	public static WebDriver driver = Test_runner_Auto.driver;

	public static Page_object_manager pom = new Page_object_manager(driver); 
    	

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
	   
		implicitWait(20,TimeUnit.SECONDS);
		getUrl("http://automationpractice.com/");
		
	}

	@When("^user Click The Sign In Button$")
	public void user_Click_The_Sign_In_Button() throws Throwable {
	    
		Click(pom.getHp().getSg());
	}

	@When("^user Enter The \"([^\"]*)\" In The Email Field$")
	public void user_Enter_The_In_The_Email_Field(String Email) throws Throwable {
	   SendKeys(pom.getEm().getEm(), Email);
	}

	@When("^user Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String Password) throws Throwable {
	   
		SendKeys(pom.getEm().getPs(), Password);
	}

	@Then("^user Click On The Sign In Button And It Navigate To Home Page$")
	public void user_Click_On_The_Sign_In_Button_And_It_Navigate_To_Home_Page() throws Throwable {
	    Click(pom.getEm().getS());
	}

	@When("^user Click On The Women Button$")
	public void user_Click_On_The_Women_Button() throws Throwable {
	   Click(pom.getEm().getCk());
	}

	@When("^user Select the Dress$")
	public void user_Select_the_Dress() throws Throwable {
	   Click(pom.getPd().getOpen());
	}

	@When("^user Select The Quantity Of Dress$")
	public void user_Select_The_Quantity_Of_Dress() throws Throwable {
		Click(pom.getPd().getQuantity_btn());
	}

	@When("^user Select The Dress Size$")
	public void user_Select_The_Dress_Size() throws Throwable {
	    Click(pom.getPd().getSize_btn());
	}

	@When("^user Select The Dress Colour$")
	public void user_Select_The_Dress_Colour() throws Throwable {
	   Click(pom.getPd().getColour());
	}

	@When("^user Click On The Add To Cart Button$")
	public void user_Click_On_The_Add_To_Cart_Button() throws Throwable {
	   Click(pom.getPd().getSubmit_btn());
	}

	@When("^user Click On The Proceed To Checkout Button$")
	public void user_Click_On_The_Proceed_To_Checkout_Button() throws Throwable {
	    Click(pom.getCkOut().getProceed_to());
	}

	@When("^user Click On The Sign in Proceed To Checkout Button$")
	public void user_Click_On_The_Sign_in_Proceed_To_Checkout_Button() throws Throwable {
	   Click(pom.getSi().getSign_in());
	}

	@When("^user Click On The  Address Proceed To Chekout Button$")
	public void user_Click_On_The_Address_Proceed_To_Chekout_Button() throws Throwable {
	   Click(pom.getSp().getShipping());
	}

	@When("^user Click On The Terms Of Service Check Box$")
	public void user_Click_On_The_Terms_Of_Service_Check_Box() throws Throwable {
		Click(pom.getSp().getClick());
	}

	@When("^user Click To Choose The Payment Type$")
	public void user_Click_To_Choose_The_Payment_Type() throws Throwable {
	    Click(pom.getP().getPayby());
	}

	@When("^user Click On The I Confirm My Order Button$")
	public void user_Click_On_The_I_Confirm_My_Order_Button() throws Throwable {
	   Click(pom.getCo().getOrder());
	}

	@Then("^user Click On The Sign Out Button And It Navigate To Home Page$")
	public void user_Click_On_The_Sign_Out_Button_And_It_Navigate_To_Home_Page() throws Throwable {
	   Click(pom.getCo().getSignOut());
	}

	@When("^user Click On The Dresses Button$")
	public void user_Click_On_The_Dresses_Button() throws Throwable {
		Click(pom.getD().getClick());
	}

	@When("^user Click On The Dress Type$")
	public void user_Click_On_The_Dress_Type() throws Throwable {
	    Click(pom.getD().getSummer_dress());
	}

	@When("^user Select The Dress$")
	public void user_Select_The_Dress() throws Throwable {
	    Click(pom.getD().getPname());
	}

	@When("^user Click The Quantity Button$")
	public void user_Click_The_Quantity_Button() throws Throwable {
	 Click(pom.getD().getQuantity_btn());
	}

	@When("^user Click The Size$")
	public void user_Click_The_Size() throws Throwable {
	    Click(pom.getD().getSize_btn());
	}

	@When("^user Click The Colour$")
	public void user_Click_The_Colour() throws Throwable {
	    Click(pom.getD().getblue());
	}

	@When("^user Click Add To Cart Button$")
	public void user_Click_Add_To_Cart_Button() throws Throwable {
	    Click(pom.getD().getSubmit_btn());
	}

	@When("^user Click the Summary Proceed To CheckOut Button$")
	public void user_Click_the_Summary_Proceed_To_CheckOut_Button() throws Throwable {
	    Click(pom.getCkOut().getProceed_to());
	}

	@When("^user Click The Sigin Proceed To Checkout Button$")
	public void user_Click_The_Sigin_Proceed_To_Checkout_Button() throws Throwable {
	   Click(pom.getSi().getSign_in());
	}

	@When("^user Click The Address Proceed To CheckOut Button$")
	public void user_Click_The_Address_Proceed_To_CheckOut_Button() throws Throwable {
	   Click(pom.getSp().getShipping());
	}

	@When("^User Click The Terms Of Service Box$")
	public void user_Click_The_Terms_Of_Service_Box() throws Throwable {
	    Click(pom.getSp().getClick());
	}

	@When("^user Click The Payment Type$")
	public void user_Click_The_Payment_Type() throws Throwable {
	   Click(pom.getP().getPay());
	}
	@When("^user Click On The Payment Proceed To CheckOut$")
	public void user_Click_On_The_Payment_Proceed_To_CheckOut() throws Throwable {
	  Click(pom.getP().getPayby());
	}

	@When("^user Click The Order Conformed Button$")
	public void user_Click_The_Order_Conformed_Button() throws Throwable {
	   Click(pom.getCo().getOrder());
	}

	@Then("^User Click The SignOut Button It Navigate To Home Page$")
	public void user_Click_The_SignOut_Button_It_Navigate_To_Home_Page() throws Throwable {
	   Click(pom.getCo().getSignOut());
	}

	@When("^user Click On The Tshirts Button$")
	public void user_Click_On_The_Tshirts_Button() throws Throwable {
		Click(pom.getT().getClick());
	}

	@When("^user Click On The Dress$")
	public void user_Click_On_The_Dress() throws Throwable {
		Click(pom.getT().getshirt());
	}

	@When("^user Click On Add To Cart Button$")
	public void user_Click_On_Add_To_Cart_Button() throws Throwable {
	  Click(pom.getT().getSubmit_btn());
	}

	@When("^user Click On Summary Proceed To Checkout Button$")
	public void user_Click_On_Summary_Proceed_To_Checkout_Button() throws Throwable {
	    Click(pom.getCkOut().getProceed_to());	
	}

	@When("^user Click On SignIn Proceed To Checkout Button$")
	public void user_Click_On_SignIn_Proceed_To_Checkout_Button() throws Throwable {
		Click(pom.getSi().getSign_in());
	}

	@When("^user Click On Address Proceed To Checkout Button$")
	public void user_Click_On_Address_Proceed_To_Checkout_Button() throws Throwable {
	   Click(pom.getAs().getAddress());
	}

	@When("^user Click To The Payment Type$")
	public void user_Click_To_The_Payment_Type() throws Throwable {
	   Click(pom.getP().getPayby());
	}

	@When("^user Click On I Confirm My Order Button$")
	public void user_Click_On_I_Confirm_My_Order_Button() throws Throwable {
	   Click(pom.getCo().getOrder());
	}

	@Then("^user Click On Sign Out Button And It Navigate To Home Page$")
	public void user_Click_On_Sign_Out_Button_And_It_Navigate_To_Home_Page() throws Throwable {
	    Click(pom.getCo().getSignOut());
	}


}