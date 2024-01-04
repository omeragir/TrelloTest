Feature: Workspace Create
  @ui
  Scenario: Create and delete Workspace
    Given User logged in with valid credentials and is on the Trello home page
    When User creates a new Trello workspace with name "<WorkspaceName>"
    Then User choose type of the  WorkSpace
    Then User click continue button
    And User choose later options
    Then User see the workspace on the Ui part
    Then User click create button
    Then User click create board button
    And User write board name
    And User click board create  button
    Then User see the board on the UI part
    Then User click three dot icon
    Then User click close board button
    And User click permanently delete
    Then User click permanently delete button
    Then User don`t see the UI part board name
    And User click konto button
    Then User click log out button
    And User click ausloggen button
    Then User land on home page


