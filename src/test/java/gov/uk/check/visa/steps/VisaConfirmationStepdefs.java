package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uk.check.visa.pages.*;
import org.testng.Assert;

public class VisaConfirmationStepdefs {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on start button$")
    public void iClickOnStartButton() {
        new StartPage().clickOnStartButton();
    }

    @And("^I select a nationality Australia$")
    public void iSelectANationalityAustralia() {
        new SelectNationalityPage().selectNationalityAustralia();
    }

    @And("^I click on nationality continue button$")
    public void iClickOnNationalityContinueButton() {
        new SelectNationalityPage().nationalityContinueButton();
    }

    @And("^I select reason Tourism$")
    public void iSelectReasonTourism() {
        new ReasonForTravelPage().selectReasonTourism();
    }

    @And("^I click on reason continue button$")
    public void iClickOnReasonContinueButton() {
        new ReasonForTravelPage().clickOnReasonContinueButton();
    }

    @Then("^I verify result you will not need a visa to come to the UK$")
    public void iVerifyResultYouWillNotNeedAVisaToComeToTheUK() {
        String resultText = new ResultPage().verifyResult();
        Assert.assertEquals(resultText, "You will not need a visa to come to the UK");
    }

    @And("^I select a Nationality Chile$")
    public void iSelectANationalityChile() {
        new SelectNationalityPage().selectNationalityChile();
    }

    @And("^I select reason work academic visit or business$")
    public void iSelectReasonWorkAcademicVisitOrBusiness() {
        new ReasonForTravelPage().selectReasonWork();
    }

    @And("^I select intended to stay for longer than (\\d+) months$")
    public void iSelectIntendedToStayForLongerThanMonths(int arg0) {
        new DurationOfStayPage().selectIntendedToStayForLongerThan6Months();
    }

    @And("^I click on duration continue button$")
    public void iClickOnDurationContinueButton() {
        new DurationOfStayPage().clickOnDurationContinueButton();
    }

    @And("^I select have planning to work for health and care professional$")
    public void iSelectHavePlanningToWorkForHealthAndCareProfessional() {
        new WorkTypePage().selectWorkForHealthAndCareProfessional();
    }

    @And("^I click on worktype continue button$")
    public void iClickOnWorktypeContinueButton() {
        new WorkTypePage().clickOnWorkTypeContinueButton();
    }

    @Then("^I verify result You need a visa to work in health and care$")
    public void iVerifyResultYouNeedAVisaToWorkInHealthAndCare() {
        String resultText2 = new ResultPage().verifyResult();
        Assert.assertEquals(resultText2, "You need a visa to work in health and care");
    }

    @And("^I select a nationality Colombia$")
    public void iSelectANationalityColombia() {
        new SelectNationalityPage().selectNationalityColumbia();
    }

    @And("^I select reason join partner or family for a long stay$")
    public void iSelectReasonJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().selectReasonJoinPartnerOrFamilyForALongStay();
    }

    @And("^I select state my partner of family member have uk immigration status yes$")
    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatusYes() {
        new FamilyImmigrationStatusPage().selectMyPartnerOrFamilyImmigrationYes();
    }

    @And("^I click on family immigration continue button$")
    public void iClickOnFamilyImmigrationContinueButton() {
        new FamilyImmigrationStatusPage().clickOnFamilyImmigrationContinueButton();
    }

    @Then("^I verify result you'll need a visa to join your family or partner in the UK$")
    public void iVerifyResultYouLlNeedAVisaToJoinYourFamilyOrPartnerInTheUK() {
        String resultText3 = new ResultPage().verifyResult();
        Assert.assertEquals(resultText3, "You’ll need a visa to join your family or partner in the UK");
    }
}