Feature: Get Carbon Intensity data for current half hour. All times provided in UTC (+00:00)

  Scenario:Verify Get /intensity endpoint responds successfully - Happy Path
    Given I have endpoint for "carbonintensity" domain
    When I call "GET" http method on "/intensity" endpoint
    Then I should get status code as 200
    And Json schema of "/intensity" response is as expected
    And Response header is "Access-Control-Allow-Origin" of type "String.Class"

    @run
  Scenario:Verify GET /intensity endpoint returns only 1 object
    Given I have endpoint for "carbonintensity" domain
    When I call "GET" http method on "/intensity" endpoint
    Then  I should get 2 carbon intensity object in response


#    Scenario: Verify carbon intensity returned for half hour
#      Given I have endpoint for "carbonintensity" domain
#      When I call "GET" http method on "/intensity" endpoint
#      Then Difference in from and to time should be 30 mins
