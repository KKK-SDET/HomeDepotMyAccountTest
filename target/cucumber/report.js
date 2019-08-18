$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/creditCardApplication.feature");
formatter.feature({
  "name": "Home depot credit card",
  "description": "  Applying to Home Depot credit card",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@creditCardApplication"
    }
  ]
});
formatter.scenarioOutline({
  "name": "user is submitting application to Homedepot Credit Card",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user navigates to My Account",
  "keyword": "When "
});
formatter.step({
  "name": "user signs in with valid email \"\u003cemail\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user selects Exclusive Consumer Credit Card Offers",
  "keyword": "And "
});
formatter.step({
  "name": "user enters first name \"\u003cfirstName\u003e\", last name \"\u003clastName\u003e\" and email \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters address \"\u003caddress\u003e\", city \"\u003ccity\u003e\", selects state, enters zipcode \"\u003czipcode\u003e\" and phonenumber \"\u003cphoneNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters rent payment \"\u003crentSum\u003e\", residence status and annual income \"\u003cnetIncome\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters SSN \"\u003cssn\u003e\" and birthDate \"\u003cDOB\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user submits application",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "firstName",
        "lastName",
        "address",
        "city",
        "zipcode",
        "phoneNumber",
        "rentSum",
        "netIncome",
        "ssn",
        "DOB"
      ]
    },
    {
      "cells": [
        "barbolbaike@gmail.com",
        "Bishkek312",
        "KK",
        "CC",
        "6223 North Western Ave",
        "Chicago",
        "60659",
        "7824580975",
        "1300",
        "40000",
        "",
        "12121998"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Home Depot web-site is up and running and MyAccount icon is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "MyAccountRegistration.home_Depot_web_site_is_up_and_running_and_MyAccount_icon_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "user is submitting application to Homedepot Credit Card",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@creditCardApplication"
    }
  ]
});
formatter.step({
  "name": "user navigates to My Account",
  "keyword": "When "
});
formatter.match({
  "location": "CreditCardApplication.user_navigates_to_My_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user signs in with valid email \"barbolbaike@gmail.com\" and password \"Bishkek312\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreditCardApplication.user_signs_in_with_valid_email_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects Exclusive Consumer Credit Card Offers",
  "keyword": "And "
});
formatter.match({
  "location": "CreditCardApplication.user_selects_Exclusive_Consumer_Credit_Card_Offers()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters first name \"KK\", last name \"CC\" and email \"barbolbaike@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreditCardApplication.user_enters_first_name_last_name_and_email(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters address \"6223 North Western Ave\", city \"Chicago\", selects state, enters zipcode \"60659\" and phonenumber \"7824580975\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreditCardApplication.user_enters_address_city_selects_state_enters_zipcode_and_phonenumber(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters rent payment \"1300\", residence status and annual income \"40000\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreditCardApplication.user_enters_rent_payment_residence_status_and_annual_income(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters SSN \"\" and birthDate \"12121998\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreditCardApplication.user_enters_SSN_and_birthDate(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user submits application",
  "keyword": "Then "
});
formatter.match({
  "location": "CreditCardApplication.user_submits_application()"
});
formatter.result({
  "status": "skipped"
});
});