package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataPageStepTwo extends PageObject {
    public static final Target INPUT_CITY = Target.the("Where we write the city")
            .located(By.xpath("//*[@id=\"city\"]"));
    public static final Target INPUT_CODE_POSTAL = Target.the("Where we write the code postal")
            .located(By.xpath("//*[@id=\"zip\"]"));
    public static final Target CLICK_INPUT_COUNTRY = Target.the("Where we write the country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target INPUT_COUNTRY = Target.the("Where we write the country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_NEXT_DEVICE = Target.the("Click on the button for the steps next")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
}
