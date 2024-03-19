import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static WebDriver driver;
    private final String url = "https://www.levelset.com/";

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
