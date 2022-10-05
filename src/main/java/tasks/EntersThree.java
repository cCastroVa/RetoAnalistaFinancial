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
    private String computer;
    private String version;
    private String language_computer;
    private String mobile_device;
    private String model;
    private String operating_system;

    public EntersThree(String computer, String version, String language_computer, String mobile_device, String model,
                       String operating_system) {
        this.computer = computer;
        this.version = version;
        this.language_computer = language_computer;
        this.mobile_device = mobile_device;
        this.model = model;
        this.operating_system = operating_system;
    }
    public static EntersThree theData(String computer, String version, String language_computer, String mobile_device,
                                      String model, String operating_system) {
        return Tasks.instrumented(EntersThree.class, computer, version, language_computer, mobile_device, model, operating_system);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DataPageStepThree.COMPUTER),
                Enter.theValue(computer).into(DataPageStepThree.INPUT_COMPUTER),
                Hit.the(Keys.ENTER).into(DataPageStepThree.INPUT_COMPUTER),
                Click.on(DataPageStepThree.VERSION),
                Enter.theValue(version).into(DataPageStepThree.INPUT_VERSION),
                Hit.the(Keys.ENTER).into(DataPageStepThree.INPUT_VERSION),
                Click.on(DataPageStepThree.LANGUAGE),
                Enter.theValue(language_computer).into(DataPageStepThree.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(DataPageStepThree.INPUT_LANGUAGE),
                Click.on(DataPageStepThree.MOBILE_DEVICE),
                Enter.theValue(mobile_device).into(DataPageStepThree.INPUT_MOBILE_DEVICE),
                Hit.the(Keys.ENTER).into(DataPageStepThree.INPUT_MOBILE_DEVICE),
                Click.on(DataPageStepThree.MOBILE_MODEL),
                Enter.theValue(model).into(DataPageStepThree.INPUT_MOBILE_MODEL),
                Hit.the(Keys.ENTER).into(DataPageStepThree.INPUT_MOBILE_MODEL),
                Click.on(DataPageStepThree.MOBILE_O_S),
                Enter.theValue(operating_system).into(DataPageStepThree.INPUT_MOBILE_O_S),
                Hit.the(Keys.ENTER).into(DataPageStepThree.INPUT_MOBILE_O_S),
                Click.on(DataPageStepThree.BUTTON_NEXT_LAST_STEP));

    }
}
