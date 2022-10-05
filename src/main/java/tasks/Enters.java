package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import userinterface.DataPageStepOne;

public class Enters implements Task {

    private String first_name;
    private String last_name;
    private String email_address;
    private String language;
    public Enters(String first_name, String last_name, String email_address, String language) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_address = email_address;
        this.language = language;
    }
    public static Enters theData(String first_name, String last_name, String email_address, String language) {
        return Tasks.instrumented(Enters.class, first_name, last_name, email_address, language);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(first_name).into(DataPageStepOne.INPUT_FIRST_NAME),
                Enter.theValue(last_name).into(DataPageStepOne.INPUT_LAST_NAME),
                Enter.theValue(email_address).into(DataPageStepOne.INPUT_EMAIL_ADDRESS),
                Click.on(DataPageStepOne.MONTH_BIRTH),
                Click.on(DataPageStepOne.DAY_BIRTH),
                Click.on(DataPageStepOne.YEAR_BIRTH),
                Enter.theValue(language).into(DataPageStepOne.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(DataPageStepOne.INPUT_LANGUAGE),
                Click.on(DataPageStepOne.BUTTON_NEXT));
    }
}
