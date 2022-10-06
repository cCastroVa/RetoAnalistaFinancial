package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataPageStepOne extends PageObject {
    public static final Target INPUT_FIRST_NAME = Target.the("Where we write the first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Where we write the last name")
            .located(By.name("lastName"));
    public static final Target INPUT_EMAIL_ADDRESS = Target.the("Where we write the email address")
            .located(By.id("email"));
    public static final Target MONTH_BIRTH = Target.the("Click on the month of date birth")
            .located(By.name("birthMonth"));
    public static final Target DAY_BIRTH = Target.the("Click on the day of date birth")
            .located(By.id("birthDay"));
    public static final Target YEAR_BIRTH = Target.the("Click on the year of date birth")
            .located(By.name("birthYear"));
    public static final Target INPUT_LANGUAGE = Target.the("Where we write the native language")
            .located(By.xpath("//input[@type='search']"));
    public static final Target BUTTON_NEXT = Target.the("Click on the button for the steps next")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}