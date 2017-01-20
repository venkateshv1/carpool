package carpool;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;
public class CucumberSteps {
	
	@Given("^Employee \"([^\"]*)\" enters office as Source and \"([^\"]*)\" as the destination and time is \"([^\"]*)\"$")
	public void employee_enters_office_as_Source_and_as_the_destination_and_time_is(String arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   

	}

	@Given("^his email is \"([^\"]*)\" and phone is \"([^\"]*)\"$")
	public void his_email_is_and_phone_is(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Ride ride= new Ride();
		ride.setEmail(arg1);
		ride.setPhoneNo(arg2);

		
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^data gets saved and message \"([^\"]*)\" get displayed as OK$")
	public void data_gets_saved_and_message_get_displayed_as_OK(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Ride ride= new Ride();
		assertEquals(arg1,ride.saveRide());
	}

	@Then("^If user clicks \"([^\"]*)\" he is redirected to \"([^\"]*)\"$")
	public void if_user_clicks_he_is_redirected_to(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	    
	    

}
}
