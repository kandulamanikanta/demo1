@PoC_RPAPI_Demo

Feature: RPAPI SOAP Testing

    Scenario:
        Given SOAP request is sent for the operation GetCitiesByCountry for the country IND
        Then the response should have the expected value.
