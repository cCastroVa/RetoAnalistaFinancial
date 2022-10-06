package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreatePasswordPage extends PageObject {
    public static final Target PASSWORD = Target.the("Where we create the password")
            .located(By.id("password"));
    public static final Target PASSWORD_REPEAT = Target.the("Where we repeat the password")
            .located(By.name("confirmPassword"));
}
