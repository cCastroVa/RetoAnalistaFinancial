package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.*;

public class UtestStepDefinition {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Carlos is on the Utest page$")
    public void thanCarlosIsOnTheUtestPage() {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }
    @When("^he clicks Join Today on the Utest page$")
    public void heClicksJoinTodayOnTheUtestPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(JoinToday.the());
    }
    @When("^he enters the data required in the four registration steps$")
    public void heEntersTheDataRequiredInTheFourRegistrationSteps() {
        OnStage.theActorInTheSpotlight().attemptsTo(Enters.theData(),(EntersTwo.theData()), (EntersThree.theData()),
                EntersFour.theData());
    }
    @When("^he accept the terms of use, the guidelines and the privacy and security policy of utest$")
    public void heAcceptTheTermsOfUseTheGuidelinesAndThePrivacyAndSecurityPolicyOfUtest() {
        OnStage.theActorInTheSpotlight().attemptsTo(Accept.theTerms());
    }
    @Then("^he registers successful on the Utest page seeing a message (.*)$")
    public void heRegistersSuccessfulOnTheUtestPageSeeingAMessageCheckYourEmailInbox(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
