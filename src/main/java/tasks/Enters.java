package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import userinterface.DataPageStepOne;

public class Enters implements Task {

    public static Enters theData() {
        return Tasks.instrumented(Enters.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Carlos").into(DataPageStepOne.INPUT_FIRST_NAME),
                Enter.theValue("Castro").into(DataPageStepOne.INPUT_LAST_NAME),
                Enter.theValue("ccastro@choucairt.com").into(DataPageStepOne.INPUT_EMAIL_ADDRESS),
                Click.on(DataPageStepOne.MONTH_BIRTH),
                Click.on(DataPageStepOne.DAY_BIRTH),
                Click.on(DataPageStepOne.YEAR_BIRTH),
                Enter.theValue("Spanish").into(DataPageStepOne.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(DataPageStepOne.INPUT_LANGUAGE),
                Click.on(DataPageStepOne.BUTTON_NEXT));
    }
}
