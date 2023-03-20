Feature: Homework7

  Background: I am as a user on the main page of "Onliner" web-site
    Given Go to the page "https://www.onliner.by/"

  Scenario: First scenario
    When Hover over the "Auto Flea Market" section
    Then Сheck that all categories of the section have appeared in the submenu
