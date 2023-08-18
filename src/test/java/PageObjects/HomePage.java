package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;
    private Waits waits;

    public HomePage (WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement getUserNameTextField(){
        return waits.visibilityOfElement(By.name("email"));
    }
    public WebElement getUserPasswordField(){
        return waits.visibilityOfElement(By.name("password"));
    }
    public WebElement getAcessarButton(){
        return driver.findElement(By.xpath("//button[.='Acessar']"));
    }
}
