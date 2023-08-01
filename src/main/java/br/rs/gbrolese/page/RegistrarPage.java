package br.rs.gbrolese.page;

import java.util.regex.Pattern;

import br.rs.gbrolese.core.BasePage;

public class RegistrarPage extends BasePage {
	
	BasePage basePage = new BasePage();
	LoginPage login = new LoginPage();
	
	public void acessarRegistraConta() {
		clicarBotaoPorTexto("Registrar");
	}

	public void registrarConta(String email, String name,String senha,String conf_senha) throws InterruptedException {
	
			escreverByCSS(".card__register [name=email]", email);
			escreverByCSS(".card__register [name=name]", name);
			escreverByCSS(".card__register [name=password]", senha);
			escreverByCSS(".card__register [name=passwordConfirmation]", conf_senha);
			Thread.sleep(500);
			clicaBotaoByCSS(".card__register [id=toggleAddBalance]");
			Thread.sleep(500);
			clicarBotaoPorTexto("Cadastrar");
	    //	String mensagemSucesso = contaPage.obterMensagemSucesso();
		//	String accountNumber = mensagemSucesso.trim().split(" ")[2];
		//	System.out.println(mensagemSucesso);
			clicarBotao("btnCloseModal");
			login.logar(email, senha);
			String accountNumber = basePage.obterTextoByXPath("//*[@id=\"textAccountNumber\"]/span");
			
			
		}
	}

