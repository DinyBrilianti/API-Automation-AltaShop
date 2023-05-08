Feature: Products
  As a user feature
  I have be able to success create, get, and delete products
  So that I can create, get, get all, and delete products

  Scenario: Get all products
    Given user is on the products GET page endpoint
    When user is on the request page with an endpoint and GET method
    Then user should receive a list of products
    And user receive the response code 200 OK

  Scenario: Post New Product
    Given user is on the product POST page endpoint
    When user is on the request page with the endpoint, method POST and JSON format body
    Then i receive the response code 200 OK
    And the post add new product that was just created

  Scenario: Get Product By ID
    Given User is on the product by ID GET page endpoint
    When user is on the request page with an endpoint and get method
    Then user should receive a product by ID
    And user receive response code 200 ok

  Scenario: Delete a Product
    Given user wants to delete post category with valid ID
    When user is on the request page with an endpoint with ID and DELETE method
    Then user receive response code 200 ok and data is null
    And post data with ID 11316 has been deleted

  Scenario: Post Product Rating
    Given user is on the product rating POST page endpoint
    When user is on the request page with the endpoint and POST method
    Then user add product rating in body format JSON
    And i receive the response code 200ok

  Scenario: Get Product Ratings
    Given user is on the products rating GET page endpoint
    When user is on the request page with an endpoint and Get Method
    Then user should receive a product rating
    And user receive the response code 200ok

  Scenario: Post Comment Product
    Given user is on the product comment POST page endpoint
    When user on the request page with the endpoint, POST method, bearer token and JSON format body
    Then user add product comment in body format JSON
    And i receive the response code 200 ok

  Scenario: Get Product Comments
    Given user is on the products comments GET page endpoint
    When user on The request page with an endpoint and GET method
    Then user should receive a list of products comments
    And user receive response code 200OK
