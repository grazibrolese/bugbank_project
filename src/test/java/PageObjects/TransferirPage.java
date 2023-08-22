package PageObjects;
import Framework.Browser.Waits;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferirPage extends BasePage {

	private WebDriver driver;
	private Waits waits;

	public void transferirPage (WebDriver driver){
		this.driver = driver;
		waits = new Waits(this.driver);
	}
	
	
	public void transferir(String account, String value, String description) throws InterruptedException {
		
		String[] accountParts = account.split("-");
		Thread.sleep(1000);
		escrever(By.cssSelector("input[name=\'accountNumber\']"), accountParts[0]);
		escrever(By.cssSelector("input[name=\'digit\']"), accountParts[1]);
		escrever(By.cssSelector("input[name=\'transferValue\']"), value);
		escrever(By.cssSelector("input[name=\'description\']"), description);
		clicarBotao(By.cssSelector("button[type=\'submit\']"));
		Thread.sleep(1000);
		Assert.assertEquals("Transferencia realizada com sucesso", obterTexto(By.cssSelector("p#modalText")));
		clicarBotao("btnCloseModal");
		Thread.sleep(1000);
	}
	

}

