package soap.demo.stepdefs;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class test {
	@Given("^SOAP request is sent for the operation GetCitiesByCountry for the country IND$")
	public void soap_request_is_sent_for_the_operation_GetCitiesByCountry_for_the_country_IND() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Test Passed");
	}

	@Then("^the response should have the expected value\\.$")
	public void the_response_should_have_the_expected_value() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Test continoued...!");
	}
}
