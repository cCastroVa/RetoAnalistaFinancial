package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.CreatePasswordPage;

public class EntersFour implements Task {

    private String password;
    private String repeat_password;

    public EntersFour(String password, String repeat_password) {
        this.password = password;
        this.repeat_password = repeat_password;
    }
    public static EntersFour theData(String password, String repeat_password) {
        return Tasks.instrumented(EntersFour.class, password, repeat_password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(password).into(CreatePasswordPage.PASSWORD),
                Enter.theValue(repeat_password).into(CreatePasswordPage.PASSWORD_REPEAT));

    }
}
