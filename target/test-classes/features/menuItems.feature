Feature: English Version Windows Web App

  Scenario: Menu items are correctly displayed on top
    Given Web Application URL "https://www.microsoft.com/en-us"
    When Page has fully loaded
    Then Below menu items are displayed on top of screen and displayed in console
      | Menu         |
      | Home         |
      | Windows 10   |
      | Computers    |
      | Apps         |
      | PC Gaming    |
      | For Business |
      | Support      |

  Scenario: Search function returns correct items
    Given Web Application URL "https://www.microsoft.com/en-us"
    When Searching for "Visual Studio"
    Then Products are listed in the Result list
    And Price of first Product in list matches Product details page

  Scenario: Cart displays correct Product and price
    Given Web Application URL "https://www.microsoft.com/en-us"
    When Adding Product to Cart
    Then Total Amount is same than Unit Price * 20