package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.WebDriver;

public class ExtratoPage extends BasePage {
	private WebDriver driver;
	private Waits waits;

	public ExtratoPage (WebDriver driver){
		this.driver = driver;
		waits = new Waits(this.driver);
	}

	public ExtratoPage() {

	}

	public float extrato() throws InterruptedException {
		
		Thread.sleep(1000);
		String resultadoExtrato = obterTexto("textBalanceAvailable");
		Thread.sleep(1000);
		String valorSaldo = resultadoExtrato.split(" ")[1].replace(",",".");
		Thread.sleep(1000);
		float resultado = Float.parseFloat(valorSaldo);
		Thread.sleep(1000);
		return resultado;
		
	}

}
