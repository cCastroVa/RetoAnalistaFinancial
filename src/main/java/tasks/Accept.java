package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.AcceptTermsPage;

public class Accept implements Task {
    public static Accept theTerms() {
        return Tasks.instrumented(Accept.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AcceptTermsPage.ACCEPT_TERMS_USE_AND_GUIDELINES),
                Click.on(AcceptTermsPage.ACCEPT_POLICY_PRIVACY_AND_SECURITY),
                Click.on(AcceptTermsPage.BUTTON_COMPLETE_SETUP));
    }
}
