package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DataRequired;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.*;

import java.util.List;

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
    public void heEntersTheDataRequiredInTheFourRegistrationSteps(List<DataRequired>requiredList) {
        OnStage.theActorInTheSpotlight().attemptsTo(Enters.theData(requiredList.get(0).getFirst_name(),
                        requiredList.get(0).getLast_name(), requiredList.get(0).getEmail_address(), requiredList.get(0)
                        .getMonth_bird(), requiredList.get(0).getDay_bird(), requiredList.get(0).getYear_bird(),
                requiredList.get(0).getLanguage()), (EntersTwo.theData(requiredList.get(0).getCity(), requiredList.get(0)
                        .getPostal_code(), requiredList.get(0).getCountry())),
                (EntersThree.theData(requiredList.get(0).getComputer(), requiredList.get(0).getVersion(),requiredList
                        .get(0).getLanguage_computer(), requiredList.get(0).getMobile_device(), requiredList.get(0)
                        .getModel(), requiredList.get(0).getOperating_system())), EntersFour.theData(requiredList.get(0)
                        .getPassword(), requiredList.get(0).getRepeat_password()));
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
