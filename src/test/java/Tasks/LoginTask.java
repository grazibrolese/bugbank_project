package Tasks;

import PageObjects.HomePage;
import org.openqa.selenium.WebDriver;

public class LoginTask {

    private static WebDriver driver;
    private static HomePage homePage;

   public void efetuarLogin(){
       homePage.getUserNameTextField().sendKeys("grazi.bro@gmail.com");
       homePage.getUserPasswordField().sendKeys("12345");
       homePage.getAcessarButton().click();
   }

}
