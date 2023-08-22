package PageObjects;

import Framework.Browser.Waits;
import Framework.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends TestBase {
	private WebDriver driver;
	private Waits waits;

	public void basePage (WebDriver driver){
		this.driver = driver;
		waits = new Waits(this.driver);
	}

	public void escrever(By by, String texto){
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}

	public void escrever(String name_campo, String texto){
		escrever(By.name(name_campo), texto);
	}
	public void escreverByCSS(String css_selector, String texto) {
		escrever(By.cssSelector(css_selector), texto);
	}
	
	/********* Botoes ************/
	

	public void clicarBotao(By by) {
		getDriver().findElement((by)).click();
	}
	public void clicarBotao(String id) {
		clicarBotao(By.id(id));
	}
	public void clicaBotaoByCSS(String css) {
		getDriver().findElement(By.cssSelector(css)).click();
	}
	public void clicarBotaoPorTexto(String texto){
		clicarBotao(By.xpath("//button[.='"+texto+"']"));
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
	
	/********* Obter texto  ************/
	
	public String obterTexto(By by) {
		return getDriver().findElement((by)).getText();
	}
	
	public String obterTexto(String id) {
		return getDriver().findElement(By.id(id)).getText();
	}
	
	public String obterTextoByXPath(String xpath) {
		return getDriver().findElement(By.xpath(xpath)).getText();
	}
	
	
}

