Feature: Authentication feature
  As a user
  feature I have be able to success register, login and get user information
  So that I can create new register dan login, dan get user info

  Scenario: Post new register
    Given user is on the register POST page endpoint
    When user is on the request page with the endpoint, POST method and JSON format body
    Then i receive response code 200 OK
    And the new login data that was just created

  Scenario: Post new login
    Given user is on the login POST page endpoint
    When user makes request page with the endpoint, POST method and JSON format body
    Then  user get the data bearer token
    And user receive the response code 200 ok

  Scenario: Get user information
    Given user is on the get info user page endpoint
    When user is on the request page with an endpoint and a GET method
    Then user get information data
    And user receive response code 200 OK
