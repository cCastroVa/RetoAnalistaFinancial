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
    private String month_bird;
    private String day_bird;
    private String year_bird;
    private String language;
    public Enters(String first_name, String last_name, String email_address, String month_bird, String day_bird,
                  String year_bird, String language) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_address = email_address;
        this.month_bird = month_bird;
        this.day_bird = day_bird;
        this.year_bird = year_bird;
        this.language = language;
    }
    public static Enters theData(String first_name, String last_name, String email_address, String month_bird, String day_bird,
                                 String year_bird, String language) {
        return Tasks.instrumented(Enters.class, first_name, last_name, email_address, month_bird, day_bird, year_bird, language);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(first_name).into(DataPageStepOne.INPUT_FIRST_NAME),
                Enter.theValue(last_name).into(DataPageStepOne.INPUT_LAST_NAME),
                Enter.theValue(email_address).into(DataPageStepOne.INPUT_EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(month_bird).from(DataPageStepOne.MONTH_BIRTH),
                SelectFromOptions.byVisibleText(day_bird).from(DataPageStepOne.DAY_BIRTH),
                SelectFromOptions.byVisibleText(year_bird).from(DataPageStepOne.YEAR_BIRTH),
                Enter.theValue(language).into(DataPageStepOne.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(DataPageStepOne.INPUT_LANGUAGE),
                Click.on(DataPageStepOne.BUTTON_NEXT));
    }
}
