package com.trello.page;

import com.trello.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']")
    public WebElement anmeldenButton;

    @FindBy(id = "username")
    public WebElement user;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//span[@class='css-178ag6o']")
    public WebElement submitButton;

    @FindBy(xpath = "//span[@class='DweEFaF5owOe02 V_PnoJ2AynVwLp G6CmOLx93OUZez']")
    public WebElement konto;

    @FindBy(xpath = "//button[@data-testid='account-menu-logout']")
    public WebElement abmeldenButton;

    @FindBy(xpath = "//*[@id=\"logout-submit\"]/span")
    public WebElement audLogged;


}
