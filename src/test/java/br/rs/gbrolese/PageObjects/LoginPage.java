package br.rs.gbrolese.PageObjects;

import Propriedades.Waits;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	
	private WebDriver driver;
	private Waits waits;


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
