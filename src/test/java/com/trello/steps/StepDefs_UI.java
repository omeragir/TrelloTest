package com.trello.steps;

import com.trello.page.LoginPage;
import com.trello.utilities.ConfigurationReader;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;


public class StepDefs_UI {
    LoginPage loginPage = new LoginPage();
    public static String USER = ConfigurationReader.getProperty("username");
    public static String PASSWORD = ConfigurationReader.getProperty("password");


    @Given("User logged in with valid credentials and is on the Trello home page")
    public void user_logged_in_with_valid_credentials_and_is_on_the_trello_home_page() {
        loginPage.anmeldenButton.click();
        loginPage.user.sendKeys(USER + Keys.ENTER);
        loginPage.password.sendKeys(PASSWORD);
        loginPage.submitButton.click();

    }

    @When("User creates a new Trello workspace with name {string}")
    public void user_creates_a_new_trello_workspace_with_name(String string) {

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
}
