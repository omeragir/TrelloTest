package com.trello.steps;

import com.trello.page.LoginPage;
import com.trello.page.WorkSpace_Board_Page;
import com.trello.utilities.BrowserUtilities;
import com.trello.utilities.ConfigurationReader;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;


public class StepDefs_UI {

    WorkSpace_Board_Page workSpaceBoardPage = new WorkSpace_Board_Page();
    LoginPage loginPage = new LoginPage();

    static String name;
    private static final String USER = ConfigurationReader.getProperty("username");
    private static final String PASSWORD = ConfigurationReader.getProperty("password");


    @Given("User logged in with valid credentials and is on the Trello home page")
    public void user_logged_in_with_valid_credentials_and_is_on_the_trello_home_page() {
        loginPage.anmeldenButton.click();
        loginPage.user.sendKeys(USER + Keys.ENTER);
        loginPage.password.sendKeys(PASSWORD);
        loginPage.submitButton.click();

    }

    @When("User creates a new Trello workspace with name {string}")
    public void user_creates_a_new_trello_workspace_with_name(String name) {
        workSpaceBoardPage.createBoardOrWorkSpace.click();
        BrowserUtilities.waitFor(1);
        workSpaceBoardPage.createWorkSpace.click();
        BrowserUtilities.waitFor(1);
        workSpaceBoardPage.workSpaceName.sendKeys(name);
        BrowserUtilities.waitFor(1);
        workSpaceBoardPage.workSpaceContinueButton.click();
        this.name=name;


    }

    @Then("User choose type of the  WorkSpace")
    public void user_choose_type_of_the_work_space() {

    }

    @Then("User write descriptions")
    public void user_write_descriptions() {

    }

    @Then("User click continue button")
    public void user_click_continue_button() {

    }

    @Then("User choose later options")
    public void user_choose_later_options() {

    }

    @Then("User see the workspace on the Ui part")
    public void user_see_the_workspace_on_the_ui_part() {

    }

    @Then("User click create button")
    public void user_click_create_button() {

    }

    @Then("User click create board button")
    public void user_click_create_board_button() {

    }

    @Then("User write board name")
    public void user_write_board_name() {

    }

    @Then("User click board create  button")
    public void user_click_board_create_button() {

    }

    @Then("User see the board on the UI part")
    public void user_see_the_board_on_the_ui_part() {

    }

    @Then("User click three dot icon")
    public void user_click_three_dot_icon() {

    }

    @Then("User click close board button")
    public void user_click_close_board_button() {

    }

    @Then("User click permanently delete")
    public void user_click_permanently_delete() {

    }

    @Then("User click permanently delete button")
    public void user_click_permanently_delete_button() {

    }

    @Then("User don`t see the UI part board name")
    public void user_don_t_see_the_ui_part_board_name() {

    }

    @Then("User click konto button")
    public void user_click_konto_button() {

    }

    @Then("User click log out button")
    public void user_click_log_out_button() {

    }

    @Then("User click ausloggen button")
    public void user_click_ausloggen_button() {

    }

    @Then("User land on home page")
    public void user_land_on_home_page() {

    }

}
