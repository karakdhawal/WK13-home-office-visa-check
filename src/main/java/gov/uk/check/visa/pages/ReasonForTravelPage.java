package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    public ReasonForTravelPage (){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (xpath = "//input[@id='response-0']")
    WebElement tourismRadioButton;

    @CacheLookup
    @FindBy (xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement reasonContinue;

    @CacheLookup
    @FindBy (xpath = "//input[@id='response-1']")
    WebElement workRadioButton;
    @CacheLookup
    @FindBy (xpath = "//input[@id='response-4']")
    WebElement joinPartnerOrFamilyButton;

    public void selectReasonJoinPartnerOrFamilyForALongStay (){
        clickOnElement(joinPartnerOrFamilyButton);
    }

    public void selectReasonWork (){
        clickOnElement(workRadioButton);
    }

    public void clickOnReasonContinueButton (){
        clickOnElement(reasonContinue);
    }
    public void selectReasonTourism () {
        clickOnElement(tourismRadioButton);
    }

}
