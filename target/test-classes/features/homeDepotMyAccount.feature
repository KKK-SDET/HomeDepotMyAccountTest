Feature: HomeDepot My Account

  Registering Pro-account with already used data

  Background:
    Given Home Depot web-site is up and running and MyAccount icon is displayed

  @negativeOne
  Scenario Outline: user is using valid but already reserved email for registration:

    When user navigates to My Account and Registration sections
    And user enters valid but a reserved email "<email>" and password "<password>"
    And user enters valid zipcode "<zip>" and phone number "<phoneNumber>"
    Then check CreateAccount button status

    Examples:
      | email               | password | zip   | phoneNumber |
      | ritak8764@gmail.com | A1234567 | 60659 | 7736549870  |


