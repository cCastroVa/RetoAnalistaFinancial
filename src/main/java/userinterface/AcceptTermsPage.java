package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AcceptTermsPage extends PageObject {
    public static final Target ACCEPT_TERMS_USE_AND_GUIDELINES = Target.the("Where we accept the terms " +
            "of use and the guidelines of Utest").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target ACCEPT_POLICY_PRIVACY_AND_SECURITY = Target.the("Where we accept the " +
            "policy of privacy and security of Utest").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_COMPLETE_SETUP = Target.the("Click on the button to finish")
            .located(By.xpath("//*[@id=\"laddaBtn\"]/span"));
    public static final Target MESSAGE_WELCOME = Target.the("Extract the message check your email inbox ")
            .located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[2]/div[1]/p[1]/b"));
}