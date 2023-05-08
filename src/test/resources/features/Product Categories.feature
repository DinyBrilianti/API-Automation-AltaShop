Feature: Product categories feature
  As a user feature
  I have be able to success create, get, and delete category
  So that I can create, get, get all, and delete category

  Scenario: Post new category
    Given user on the product POST page endpoint
    When user on the request page with the endpoint, POST method and JSON format body
    Then I receive the response Code 200 ok
    And the post add new category that was just created

  Scenario: Get category by ID
    Given user is on the category GET page endpoint
    When user is on the request page with an endpoint with ID and GET method
    Then user should receive a category by ID
    And user receive the Response code 200 OK

  Scenario: Get all categories
    Given user on the category GET page endpoint
    When user on the request page with an endpoint and GET method
    Then user should receive a list of categories product
    And I receive response code 200OK

  Scenario: Delete a category
    Given user want to delete post category with valid ID
    When user on the request page with an endpoint with ID and DELETE method
    Then I receive response code 200 ok and Data is null
    And  data POST with ID 11311 has been deleted
