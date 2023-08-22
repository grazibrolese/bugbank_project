package tests;

import Framework.TestBase;
import PageObjects.*;
import Tasks.RegistrarContaTask;
import org.junit.Test;

public class CT01_TransferenciaEntreContas extends TestBase {
	Registrar registrar = new Registrar();
	MenuPage menu = new MenuPage();
	TransferirPage transferir = new TransferirPage();
	ExtratoPage saldo = new ExtratoPage();
	RegistrarContaTask registrarTask = new RegistrarContaTask();
	@Test
	public void testCompleto() throws InterruptedException {
		/*
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
		*/

		registrarTask.efetuarRegistro();
		
		
		
	}
}
