package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.DataPageStepTwo;

public class EntersTwo implements Task {

    private String city;
    private String postal_code;
    private String country;
    public EntersTwo(String city, String postal_code, String country) {
        this.city = city;
        this.postal_code = postal_code;
        this.country = country;
    }

    public static EntersTwo theData(String city,String postal_code, String country) {
        return Tasks.instrumented(EntersTwo.class, city, postal_code, country);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DataPageStepTwo.INPUT_CITY),
                Clear.field(DataPageStepTwo.INPUT_CITY),
                Enter.theValue(city).into(DataPageStepTwo.INPUT_CITY),
                Hit.the(Keys.DOWN).into(DataPageStepTwo.INPUT_CITY),
                Hit.the(Keys.ENTER).into(DataPageStepTwo.INPUT_CITY),
                Enter.theValue(postal_code).into(DataPageStepTwo.INPUT_CODE_POSTAL),
                Click.on(DataPageStepTwo.CLICK_INPUT_COUNTRY),
                Enter.theValue(country).into(DataPageStepTwo.INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(DataPageStepTwo.INPUT_COUNTRY),
                Click.on(DataPageStepTwo.BUTTON_NEXT_DEVICE));
    }
}
