package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	
	private WebDriver driver;


	public void setEmail(String email) {
		escrever("email", email);
	}
	public void setSenha(String senha) {
		escrever("password", senha);
	}
	public void entrar(){
		clicarBotaoPorTexto("Acessar");
	}	
	public void logar(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		entrar();
	}
}
