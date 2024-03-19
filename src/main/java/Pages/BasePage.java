package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BasePage {
protected WebDriver driver;
public BasePage(WebDriver driver){
    PageFactory.initElements(driver,this);
}
    protected Duration timeOut= Duration.ofSeconds(30);
    protected static void clickElement(WebElement element){
        element.click();
    }

}
