package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class= \"btn btn-info btn-outline mob-dropdown-btn\"]")
    WebElement getPaidButton;

    public void clickPaidButton(){
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement getPaidButtonDisplayed = wait.until(ExpectedConditions.elementToBeClickable(getPaidButton));
        clickElement(getPaidButtonDisplayed);
        clickElement(getPaidButtonDisplayed);
    }
}
