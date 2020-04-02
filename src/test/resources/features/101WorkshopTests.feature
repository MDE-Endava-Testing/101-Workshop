Feature: Validate El Tiempo website

  Scenario: Go to El Tiempo and validate Colombia section
    Given the user visits the El Tiempo website
    When the user clicks on the Colombia option
    Then the Colombia page should load