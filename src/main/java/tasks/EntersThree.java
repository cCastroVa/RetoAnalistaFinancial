package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.DataPageStepThree;

public class EntersThree implements Task {
    public static EntersThree theData() {
        return Tasks.instrumented(EntersThree.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DataPageStepThree.COMPUTER),
                Enter.theValue("Windows").into(DataPageStepThree.INPUT_COMPUTER),
                Hit.the(Keys.ENTER).into(DataPageStepThree.INPUT_COMPUTER),
                Click.on(DataPageStepThree.VERSION),
                Enter.theValue("Windows 10 Education").into(DataPageStepThree.INPUT_VERSION),
                Hit.the(Keys.ENTER).into(DataPageStepThree.INPUT_VERSION),
                Click.on(DataPageStepThree.LANGUAGE),
                Enter.theValue("Spanish").into(DataPageStepThree.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(DataPageStepThree.INPUT_LANGUAGE),
                Click.on(DataPageStepThree.MOBILE_DEVICE),
                Enter.theValue("Motorola").into(DataPageStepThree.INPUT_MOBILE_DEVICE),
                Hit.the(Keys.ENTER).into(DataPageStepThree.INPUT_MOBILE_DEVICE),
                Click.on(DataPageStepThree.MOBILE_MODEL),
                Enter.theValue("Moto G9 Plus").into(DataPageStepThree.INPUT_MOBILE_MODEL),
                Hit.the(Keys.ENTER).into(DataPageStepThree.INPUT_MOBILE_MODEL),
                Click.on(DataPageStepThree.MOBILE_O_S),
                Enter.theValue("Android 10").into(DataPageStepThree.INPUT_MOBILE_O_S),
                Hit.the(Keys.ENTER).into(DataPageStepThree.INPUT_MOBILE_O_S),
                Click.on(DataPageStepThree.BUTTON_NEXT_LAST_STEP));

    }
}
