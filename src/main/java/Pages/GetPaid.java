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
//private WebElement sendDocumentLabel = driver.findElement(By.cssSelector("label.js-send-document.btn.btn-sm.btn-toggle.active"));

    @FindBy (xpath = "//div[contains(text(), 'Exchange a Waiver')]")
  public  WebElement itemLabel;
    @FindBy (xpath = "//div[contains(text(), 'Exchange a Waiver')]/..//span[@class='price-amount']")
  public  WebElement itemPrice;

public WebElement getPaidPageIsLoaded()
{
    WebDriverWait wait = new WebDriverWait(driver, timeOut);
    return wait.until(ExpectedConditions.visibilityOf(sendDocumentLabel));
}

//    public WebElement setItemLabel(String itemName){
//        String itemLabelXpath = String.format("//div[contains(text(), '%s')]", itemName);
//        WebElement itemLabel = driver.findElement(By.xpath(itemLabelXpath));
//        WebDriverWait wait = new WebDriverWait(driver, timeOut);
//        return wait.until(ExpectedConditions.visibilityOf(itemLabel));
//    }
//
//    public WebElement setItemPrice(String itemName){
//        String itemPriceXpath = String.format("//div[contains(text(), '%s')]/..//span[@class='price-amount']", itemName);
//        WebElement itemPrice = driver.findElement(By.xpath(itemPriceXpath));
//        WebDriverWait wait = new WebDriverWait(driver, timeOut);
//        return wait.until(ExpectedConditions.visibilityOf(itemPrice));
//    }








}
