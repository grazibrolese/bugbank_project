package tests;

import org.junit.Assert;
import org.junit.Test;

import Framework.Browser.BaseDefinitions;
import PageObjects.LoginPage;
import PageObjects.MenuPage;
import PageObjects.RegistrarPage;
import PageObjects.ExtratoPage;
import PageObjects.TransferirPage;

public class CT01_TransferenciaEntreContas extends BaseDefinitions {


	RegistrarPage registrar = new RegistrarPage();
	LoginPage login = new LoginPage();
	MenuPage menu = new MenuPage();
	TransferirPage transferir = new TransferirPage();
	ExtratoPage saldo = new ExtratoPage();
	
	@Test
	public void testCompleto() throws InterruptedException {
				
		//registro da Conta 1
		registrar.acessarRegistraConta();
		String conta1 = registrar.registrarConta("teste1@gmail.com", "Graziela", "12345", "12345");
		
		
		//registro da conta 2
		registrar.acessarRegistraConta();
		String conta2 = registrar.registrarConta("teste2@gmail.com", "Luciana", "12345", "12345");
		
		
		//Logar com a conta 2
		login.logar("teste2@gmail.com", "12345");
	
		
		//Transferir
		menu.acessarTransferencia();
		transferir.transferir(conta1, "50", "Transferencia teste");	
		menu.voltarButton();
		
		//Verificar Saldo
		menu.acessarExtrato();
		float saldoFinal = saldo.extrato();
		Assert.assertEquals(950.0f,saldoFinal,0.0001);
		
		
		
		
	}
}
