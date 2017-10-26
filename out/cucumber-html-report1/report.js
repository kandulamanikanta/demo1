$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/soap/demo/features/Test.feature");
formatter.feature({
  "line": 3,
  "name": "RPAPI SOAP Testing",
  "description": "",
  "id": "rpapi-soap-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@PoC_and_Demo"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "",
  "id": "rpapi-soap-testing;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "SOAP request is sent for the operation GetCitiesByCountry for the country IND",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the response should have the expected value.",
  "keyword": "Then "
});
formatter.match({
  "location": "test.soap_request_is_sent_for_the_operation_GetCitiesByCountry_for_the_country_IND()"
});
formatter.result({
  "duration": 93317360,
  "status": "passed"
});
formatter.match({
  "location": "test.the_response_should_have_the_expected_value()"
});
formatter.result({
  "duration": 109373,
  "status": "passed"
});
});