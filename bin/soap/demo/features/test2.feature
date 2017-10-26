@PoC_RPAPI_Demo2

Feature: RPAPI SOAP Testing2

    Scenario:
        Given SOAP request is sent for the operation GetCitiesByCountry for the country Singapoore
        Then the response should have the expected null value
