import Pages.GetPaid;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetPaidTest extends BaseTest {
    HomePage homePage;
    GetPaid getPaid;



    @Test
    public void itemPriceAndNameMatches() {
        homePage = new HomePage(driver);
        getPaid = new GetPaid(driver);
        homePage.clickPaidButton();
        Assert.assertTrue(getPaid.getPaidPageIsLoaded().getText().contains("Send a Document"));

        Assert.assertEquals(getPaid.itemNameDisplayed().getText(),"Exchange a Waiver");

        Assert.assertEquals(getPaid.itemPriceDisplayed().getText(),"Free");

    }



}
