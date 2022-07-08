@run1
Feature: Get Carbon Intensity data for specific date

  Scenario Outline:Get Carbon Intensity data for a specific date. All times provided in UTC (+00:00)
    Given I have endpoint for "carbonintensity" domain
    When I call "GET" http method on "/intensity/date" endpoint with path param "<date>"
    Then I should get status code as 200
    Examples:
      | date       |
      | 2022-06-28 |
      | 2022-06-27 |
      | 2022-06-06 |


  Scenario Outline:Get Carbon Intensity API response for a invalid date - UnHappy Path
    Given I have endpoint for "carbonintensity" domain
    When I call "GET" http method on "/intensity/date" endpoint with path param "<invalidDates>"
    Then I should get status code as 400
    Examples:
      | invalidDates |
      | 06-01-201    |
      | 06-01-22     |
      | 01-01-2022   |
      | 202)-01-01   |


  Scenario Outline:Verify GET /intensity/date endpoint returns only 1 object
    Given I have endpoint for "carbonintensity" domain
    When I call "GET" http method on "/intensity/date" endpoint with path param "<invalid>"
    Then I should get status code as 200
    And  I should get 0 carbon intensity object in response

    Examples:
      | invalid    |
      | 01-01-2023 |
      | 1001-01-01 |