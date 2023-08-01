package br.rs.gbrolese.tests;

import org.junit.Assert;
import org.junit.Test;

import br.rs.gbrolese.core.BaseTest;
import br.rs.gbrolese.page.LoginPage;
import br.rs.gbrolese.page.MenuPage;
import br.rs.gbrolese.page.RegistrarPage;
import br.rs.gbrolese.page.TransferirPage;

public class CT01_TransferenciaEntreContas extends BaseTest {


	RegistrarPage registrar = new RegistrarPage();
	LoginPage login = new LoginPage();
	MenuPage menu = new MenuPage();
	TransferirPage transferir = new TransferirPage();
	
	@Test
	public void testCompleto() throws InterruptedException {
		login.acessarTelaInicial();
		
		//registro da Conta 1
		registrar.acessarRegistraConta();
		registrar.registrarConta("teste1@gmail.com", "Graziela", "12345", "12345");
		
		//registro da conta 2
		registrar.acessarRegistraConta();
		registrar.registrarConta("teste2@gmail.com", "Luciana", "12345", "12345");
		
		//Logar com a conta 2
		login.logar("teste2@gmail.com", "12345");
	
		//Acessar Menu Transferir
		menu.acessarTransferencia();
		
		//Transferir
	//	transferir.transferir(accountNumber, digit, "50", "Transferencia teste");	
		menu.voltarButton();
		
		//Verificar Saldo
		
		
		
		
		
	}
}
