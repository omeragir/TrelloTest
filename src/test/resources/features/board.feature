Feature: Workspace Create
  @ui
  Scenario: Create and delete Workspace
    Given User logged in with valid credentials and is on the Trello home page
    When User creates a new Trello workspace with name "<WorkspaceName>"
    Then User choose type of the  WorkSpace
    And User write descriptions
    And User click continue button
    And User choose later options
    And User see the workspace on the Ui part