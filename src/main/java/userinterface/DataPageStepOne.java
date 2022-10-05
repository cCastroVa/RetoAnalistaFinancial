package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataPageStepOne extends PageObject {
    public static final Target INPUT_FIRST_NAME = Target.the("Where we write the first name")
            .located(By.xpath("//*[@id=\"firstName\"]"));
    public static final Target INPUT_LAST_NAME = Target.the("Where we write the last name")
            .located(By.xpath("//*[@id=\"lastName\"]"));
    public static final Target INPUT_EMAIL_ADDRESS = Target.the("Where we write the email address")
            .located(By.xpath("//*[@id=\"email\"]"));
    public static final Target MONTH_BIRTH = Target.the("Click on the month of date birth")
            .located(By.xpath("//*[@id='birthMonth']//option[contains(text(),'December')]"));
    public static final Target DAY_BIRTH = Target.the("Click on the day of date birth")
            .located(By.xpath("//*[@id='birthDay']//option[contains(text(),'3')]"));
    public static final Target YEAR_BIRTH = Target.the("Click on the year of date birth")
            .located(By.xpath("//*[@id='birthYear']//option[contains(text(),'1997')]"));
    public static final Target INPUT_LANGUAGE = Target.the("Where we write the native language")
            .located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target BUTTON_NEXT = Target.the("Click on the button for the steps next")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}