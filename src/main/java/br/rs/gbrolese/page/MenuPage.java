package br.rs.gbrolese.page;

import br.rs.gbrolese.core.BasePage;

public class MenuPage extends BasePage {


	public void acessarTransferencia() {
		clicarBotao("btn-TRANSFERÊNCIA");
	}
	public void acessarPagamentos() {
		clicarBotao("btn-PAGAMENTOS");
	}
	public void acessarExtrato() {
		clicarBotao("btn-EXTRATO");
	}
	public void acessarSaque() {
		clicarBotao("btn-SAQUE");
	}
	
}

