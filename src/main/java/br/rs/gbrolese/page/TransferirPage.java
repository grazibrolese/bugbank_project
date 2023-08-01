package br.rs.gbrolese.page;
import org.junit.Assert;
import org.openqa.selenium.By;

import br.rs.gbrolese.core.BasePage;

public class TransferirPage extends BasePage {
	
	
	
	
	public void transferir(String account, String digit, String value, String description) {
		escrever(By.cssSelector("input[name=\'accountNumber\']"), account);
		escrever(By.cssSelector("input[name=\'digit\']"), digit);
		escrever(By.cssSelector("input[name=\'transferValue\']"), value);
		escrever(By.cssSelector("input[name=\'description\']"), description);
		clicarBotao(By.cssSelector("button[type=\'submit\']"));
		Assert.assertEquals("Transferencia realizada com sucesso", obterTexto(By.cssSelector("p#modalText")));
		clicarBotao("btnCloseModal");
	}
	

}

