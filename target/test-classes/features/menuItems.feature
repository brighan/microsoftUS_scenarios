Feature: English Version Windows Web App

  Scenario: Menu items are correctly displayed on top
    Given Web Application URL "https://www.microsoft.com/en-us"
    When Page has fully loaded
    Then Below menu items are displayed on top of screen and displayed in console
      | Microsoft 365 |
      | Office        |
      | Windows       |
      | Surface       |
      | Xbox          |
      | Deals         |
      | Support       |
    And Windows menu is selected
    And Windows 10 dropdown is selected
    Then Dropdown content is displayed

  Scenario: Search function returns correct items
    Given Web Application URL "https://www.microsoft.com/en-us"
    When Searching for "Visual Studio"
    Then Products are listed in the Result list
    And Price of first Product in list matches Product details page

  Scenario: Cart displays correct Product and price
    Given Web Application URL "https://www.microsoft.com/en-us"
    When Adding "Visual Studio" Product to Cart
    Then Total Amount is same than Unit Price * 20