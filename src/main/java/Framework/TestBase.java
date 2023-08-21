package Framework;

import Framework.Browser.DriverManager;
import Framework.Browser.TypeBrowser;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestBase extends DriverManager {
    private static WebDriver driver;
    private final String URL = "https://bugbank.netlify.app//";

    public static WebDriver getDriver(){
        driver = getDriver(TypeBrowser.CHROME);
        return driver;
    }

    @BeforeEach
    public void setup(){
        getDriver().get(URL);
    }

/*    @AfterEach
    public void finish(){
        Report.close();
        quitDriver();
    }
*/


}
