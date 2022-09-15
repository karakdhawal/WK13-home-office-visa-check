package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectNationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    public SelectNationalityPage (){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (xpath = "//select[@id='response']")
    WebElement nationalityDropDown;

    @CacheLookup
    @FindBy (xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement nationalityContinue;

    public void nationalityContinueButton (){
        clickOnElement(nationalityContinue);
    }

    public void selectNationalityColumbia (){
        selectByVisibleTextFromDropDown(nationalityDropDown, "Colombia");
    }
    public void selectNationalityChile (){
        selectByVisibleTextFromDropDown(nationalityDropDown, "Chile");
    }

    public void selectNationalityAustralia (){
        selectByVisibleTextFromDropDown(nationalityDropDown, "Australia");
    }

}

