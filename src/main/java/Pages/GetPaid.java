package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetPaid extends BasePage{

    public GetPaid(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "label.js-send-document.btn.btn-sm.btn-toggle.active")
    WebElement sendDocumentLabel;
    @FindBy (xpath = "//div[contains(text(), 'Exchange a Waiver')]")
    WebElement itemLabel;
    @FindBy (xpath = "//div[contains(text(), 'Exchange a Waiver')]/..//span[@class='price-amount']")
    WebElement itemPrice;

    public WebElement getPaidPageIsLoaded()
    {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        return wait.until(ExpectedConditions.visibilityOf(sendDocumentLabel));
    }

    public WebElement itemNameDisplayed()
    {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        return wait.until(ExpectedConditions.visibilityOf(itemLabel));
    }

    public WebElement itemPriceDisplayed()
    {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        return wait.until(ExpectedConditions.visibilityOf(itemPrice));
    }

}
