package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.CreatePasswordPage;

public class EntersFour implements Task {
    public static EntersFour theData() {
        return Tasks.instrumented(EntersFour.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Asdfghjkl123*a").into(CreatePasswordPage.PASSWORD),
                Enter.theValue("Asdfghjkl123*a").into(CreatePasswordPage.PASSWORD_REPEAT));

    }
}
