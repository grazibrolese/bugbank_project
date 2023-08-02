package br.rs.gbrolese.page;

import br.rs.gbrolese.core.BasePage;
import br.rs.gbrolese.core.DriverFactory;

public class LoginPage extends BasePage {
	
	
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("https://bugbank.netlify.app//");
	}	
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
	public void registrar() {
		clicarBotaoPorTexto("Registrar");
	}
}
