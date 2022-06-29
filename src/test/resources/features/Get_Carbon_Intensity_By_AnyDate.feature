Feature: Get Carbon Intensity data for specific date
@run1
  Scenario Outline:Get Carbon Intensity data for a specific date. All times provided in UTC (+00:00)
    Given I have endpoint for "carbonintensity" domain
    When I call "GET" http method on "/intensity/date" endpoint with path param "<date>"
    Then I should get status code as 200
    Examples:
      | date       |
      | 2022-06-28 |
      | 2022-06-27 |
      | 2022-06-06 |