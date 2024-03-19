import Pages.GetPaid;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetPaidTest extends BaseTest {
    HomePage homePage;
    GetPaid getPaid;

//    String itemName = "Exchange a Waiver";
//    String itemPrice = "Free";

    @Test
    public void itemPriceAndNameMatches() {
        homePage = new HomePage(driver);  // Initialize homePage object after driver initialization
        getPaid = new GetPaid(driver);
        homePage.clickPaidButton();
        Assert.assertTrue(getPaid.getPaidPageIsLoaded().getText().contains("Send a Document"));

        Assert.assertEquals(getPaid.itemLabel.getText(),"Exchange a Waiver");

        Assert.assertEquals(getPaid.itemPrice.getText(),"Free");

    }


    
}
