package br.rs.gbrolese.PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;

public class RegistrarPage extends BasePage {
	
	BasePage basePage = new BasePage();
	LoginPage login = new LoginPage();
	MenuPage menu = new MenuPage();
	
	public void acessarRegistraConta() {
		clicarBotaoPorTexto("Registrar");
	}

	public String registrarConta(String email, String name,String senha,String conf_senha) throws InterruptedException {
	
			escreverByCSS(".card__register [name=email]", email);
			escreverByCSS(".card__register [name=name]", name);
			escreverByCSS(".card__register [name=password]", senha);
			escreverByCSS(".card__register [name=passwordConfirmation]", conf_senha);
			Thread.sleep(1000);
			
			if (!basePage.checarComSaldo()) {
				clicarBotao("toggleAddBalance");
			}
			
			Thread.sleep(1000);
			clicarBotaoPorTexto("Cadastrar");
			Thread.sleep(1000);
			
	        //verifica mensagem
			String mensagemSucesso = obterTexto(By.cssSelector("p#modalText"));
			Assert.assertTrue(mensagemSucesso.contains("foi criada com sucesso"));
			
			//fecha mensagem
			clicarBotao(By.cssSelector("a#btnCloseModal"));
			Thread.sleep(1000);
			
			//logar para armazenar o número da conta. 
			login.logar(email, senha);
			Thread.sleep(1000);
			String accountNumber = basePage.obterTextoByXPath("//*[@id=\"textAccountNumber\"]/span");
			Thread.sleep(1000);                               
			menu.sairButton();
			
			return accountNumber;
			
		}
	}

