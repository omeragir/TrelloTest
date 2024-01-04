package com.trello.page;

import com.trello.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WorkSpace_Board_Page {

    public WorkSpace_Board_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div/div[3]/button/p")
    public WebElement createBoardOrWorkSpace;

    @FindBy(xpath = "/html/body/div[3]/div/section/div/div/nav/ul/li[3]/button/span[2]")
    public WebElement createWorkSpace;

    @FindBy(xpath = "/html/body/div[3]/div/section/div/div/nav/ul/li[1]/button/span[2]")
    public WebElement createBoard;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement workSpaceName;

    @FindBy(xpath = "//div[@class=' css-1og2rpm']")
    public WebElement workSpaceType;

    @FindBy(xpath = "//input[@id=\"teamTypeSelect\"][1]")
    public WebElement workSpaceTypeBildung;

    @FindBy(xpath = "//*[@id=\"1704105690781-create-team-org-description\"]")
    public WebElement workSpaceDesc;

    @FindBy(xpath = "//*[@id=\"layer-manager-overlay\"]/div/div/div/div/div[1]/form/footer/button")
    public WebElement workSpaceContinueButton;

    @FindBy(xpath = " //a[@data-testid='show-later-button']")
    public WebElement IwillDoThisLater;

    @FindBy(xpath = "/html/body/div[3]/div/section/div/form/div[1]/label/input")
    public WebElement boardTitle;

    @FindBy(xpath = "/html/body/div[3]/div/section/div/form/button")
    public WebElement boardCreateButton;

    @FindBy(xpath = "//*[@id=\"popover-boundary\"]/div/nav/div[1]/div/div/div[2]/div/div[3]/div/h2")
    public WebElement yourBoard;

    @FindBy(xpath = "//*[@id=\"popover-boundary\"]/div/nav/div[1]/div/div/div[2]/div/div[3]/ul/div[2]/li/div[2]/div[1]/button/span/span")
    public WebElement boardIconButton;

    @FindBy(xpath = "/html/body/div[3]/div/section/div/div/button/span[1]")
    public WebElement closeBoard;

    @FindBy(xpath = "/html/body/div[3]/div/section/div/button")
    public WebElement closeButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div/div/div[2]/button")
    public WebElement permanentlyDelete;

    @FindBy(xpath = "/html/body/div[3]/div/section/div/button")
    public WebElement PermanentlyDeleteButton ;

    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div/div[1]/button[1]/span[1]")
    public List<WebElement> workSpace;





}

