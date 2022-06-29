Feature: Get Carbon Intensity data for today. All times provided in UTC (+00:00)

  @run
  Scenario: Verify GET /intensity/date endpoint
    Given I have endpoint for "carbonintensity" domain
    When I call "GET" http method on "/intensity/date" endpoint
    Then I should get status code as 200
    And Json schema of "/intensity/date" response is as expected