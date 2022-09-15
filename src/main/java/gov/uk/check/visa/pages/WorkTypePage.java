package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkTypePage extends Utility {
    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    public WorkTypePage (){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy (xpath = "//input[@id='response-0']")
    WebElement healthCareRadioButton;

    @CacheLookup
    @FindBy (xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement workTypeContinueButton;

    public void clickOnWorkTypeContinueButton (){
        clickOnElement(workTypeContinueButton);
    }


    public void selectWorkForHealthAndCareProfessional (){
        clickOnElement(healthCareRadioButton);
    }
}
