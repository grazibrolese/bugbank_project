package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Framework.TestBase.getDriver;

public class RegistrodeContaPage {
    private WebDriver driver;
    private Waits waits;

    public RegistrodeContaPage (WebDriver driver){
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement getRegistrarButton(){
        return driver.findElement(By.xpath("//button[.='Registrar']"));
    }
    public WebElement getEmailRegistroField(){
        return waits.visibilityOfElement(By.name("email"));
    }
    public WebElement getNameRegistroField(){
        return waits.visibilityOfElement(By.name("name"));
    }
    public WebElement getPasswordRegistroField(){
        return waits.visibilityOfElement(By.name("password"));
    }
    public WebElement getPasswordConfirmRegistroField(){
        return waits.visibilityOfElement(By.name("passwordConfirmation"));
    }
    public WebElement getCadastrarRegistroButton(){
        return waits.visibilityOfElement(By.xpath("//button[.='Cadastrar']"));
    }
    public WebElement getContaSaldoToggleButton(){
        return waits.visibilityOfElement(By.id("toggleAddBalance"));
    }

    public boolean checarComSaldo() {
        WebElement toggleElement = getDriver().findElement(By.xpath("//*[@id=\"toggleAddBalance\"]/parent::*"));
        String resultado = toggleElement.getAttribute("class");
        if (resultado.contains("hsmFIT")) {
            return true;
        }
        else {
            return false;
        }
    }


}
