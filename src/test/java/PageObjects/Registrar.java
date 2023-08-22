package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;

public class Registrar extends BasePage {
	
	BasePage basePage = new BasePage();
	MenuPage menu = new MenuPage();
	
	public void acessarRegistraConta() {
		clicarBotaoPorTexto("Registrar");
	}

	public String registrarConta(String email, String name,String senha,String conf_senha) throws InterruptedException {
	
			escrever("email", email);
		  //  escreverByCSS(".card__register [name=email]", email);
			escrever("name", name);
			escrever("password", senha);
			escrever("passwordConfirmation", conf_senha);
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
		//	login.logar(email, senha);
			Thread.sleep(1000);
			String accountNumber = basePage.obterTextoByXPath("//*[@id=\"textAccountNumber\"]/span");
			Thread.sleep(1000);                               
			menu.sairButton();
			
			return accountNumber;
			
		}
	}

