package Tasks;

import PageObjects.RegistrodeContaPage;
import org.openqa.selenium.WebDriver;

public class RegistrarContaTask {

    private WebDriver driver;
    private RegistrodeContaPage registrodeContaPage;

    public void efetuarRegistro(){
        registrodeContaPage.getRegistrarButton().click();
        registrodeContaPage.getEmailRegistroField().sendKeys("grazi.bro@gmail.com");
        registrodeContaPage.getNameRegistroField().sendKeys("Graziela");
        registrodeContaPage.getPasswordRegistroField().sendKeys("12345");
        registrodeContaPage.getPasswordConfirmRegistroField().sendKeys("12345");

        if (!registrodeContaPage.checarComSaldo()) {
            registrodeContaPage.getContaSaldoToggleButton().click();
        }
        registrodeContaPage.getCadastrarRegistroButton().click();
    }
}
