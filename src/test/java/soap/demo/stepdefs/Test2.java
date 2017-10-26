package soap.demo.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Test2 {

	@Given("^SOAP request is sent for the operation GetCitiesByCountry for the country Singapoore$")
	public void soap_request_is_sent_for_the_operation_GetCitiesByCountry_for_the_country_Singapoore()
			throws Throwable {
		System.out.println("*******Test Started********");

	}

	@Then("^the response should have the expected null value$")
	public void the_response_should_have_the_expected_null_value() throws Throwable {
		System.out.println("*******Test Finished********");

	}

}
