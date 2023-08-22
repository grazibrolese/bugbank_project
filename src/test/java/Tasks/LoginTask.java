package Tasks;

import PageObjects.HomePage;
import org.openqa.selenium.WebDriver;

public class LoginTask  {

    private static WebDriver driver;
    private static HomePage homePage;

    public void loginTask(){
       // super(driver);
        this.driver=driver;
        homePage = new HomePage(this.driver);

    }

   public void efetuarLogin(){
       homePage.getUserNameTextField().sendKeys("grazi.bro@gmail.com");
       homePage.getUserPasswordField().sendKeys("12345");
       homePage.getAcessarButton().click();
   }

}
