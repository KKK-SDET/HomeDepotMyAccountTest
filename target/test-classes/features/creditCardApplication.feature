@creditCardApplication
Feature: Home depot credit card
  Applying to Home Depot credit card

  Background:
    Given Home Depot web-site is up and running and MyAccount icon is displayed

  Scenario Outline: user is submitting application to Homedepot Credit Card

    When user navigates to My Account
    And user signs in with valid email "<email>" and password "<password>"
    And user selects Exclusive Consumer Credit Card Offers
    And user enters first name "<firstName>", last name "<lastName>" and email "<email>"
    And user enters address "<address>", city "<city>", selects state, enters zipcode "<zipcode>" and phonenumber "<phoneNumber>"
    And user enters rent payment "<rentSum>", residence status and annual income "<netIncome>"
    And user enters SSN "<ssn>" and birthDate "<DOB>"
    Then user submits application

    Examples:
      | email                 | password   | firstName | lastName | address                | city    | zipcode | phoneNumber | rentSum | netIncome | ssn | DOB      |
      | barbolbaike@gmail.com | Bishkek312 | KK        | CC       | 6223 North Western Ave | Chicago | 60659   | 7824580975  | 1300    | 40000     |     | 12121998 |