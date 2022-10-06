package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataPageStepThree extends PageObject {
    public static final Target COMPUTER = Target.the("Click on the operating system of the computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target INPUT_COMPUTER = Target.the("write the operating system of the computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target VERSION = Target.the("Click on the version operating system of the computer")
            .located(By.xpath("//div[@placeholder='Select a Version']"));
    public static final Target INPUT_VERSION = Target.the("write the version operating system of the computer")
            .located(By.xpath("//input[@placeholder='Select a Version']"));
    public static final Target LANGUAGE = Target.the("Click on the language operating system of the computer")
            .located(By.xpath("//div[@placeholder='Select OS language']"));
    public static final Target INPUT_LANGUAGE = Target.the("write the language operating system of the computer")
            .located(By.xpath("//input[@placeholder='Select OS language']"));
    public static final Target MOBILE_DEVICE = Target.the("Click on the name of your mobile device")
            .located(By.xpath("//div[@placeholder='Select Brand']"));
    public static final Target INPUT_MOBILE_DEVICE = Target.the("write the name of your mobile device")
            .located(By.xpath("//input[@placeholder='Select Brand']"));
    public static final Target MOBILE_MODEL = Target.the("Click on the model of your mobile device")
            .located(By.xpath("//div[@placeholder='Select a Model']"));
    public static final Target INPUT_MOBILE_MODEL = Target.the("write the model of your mobile device")
            .located(By.xpath("//input[@placeholder='Select a Model']"));
    public static final Target MOBILE_O_S = Target.the("Click on the operating system of the mobile device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_MOBILE_O_S = Target.the("write the operating system of the mobile device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target BUTTON_NEXT_LAST_STEP = Target.the("Click on the button for the steps next")
            .located(By.xpath("//a[@aria-label='Next - final step']"));
}