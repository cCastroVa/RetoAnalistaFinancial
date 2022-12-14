package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinPage extends PageObject {
    public static final Target BUTTON_JOIN = Target.the("Click in the button Join Today")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
