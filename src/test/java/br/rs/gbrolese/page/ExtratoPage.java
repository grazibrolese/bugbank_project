package br.rs.gbrolese.page;

public class ExtratoPage extends BasePage {

	
	public float extrato() throws InterruptedException {
		
		Thread.sleep(1000);
		String resultadoExtrato = obterTexto("textBalanceAvailable");
		Thread.sleep(1000);
		String valorSaldo = resultadoExtrato.split(" ")[1].replace(",",".");
		Thread.sleep(1000);
		float resultado = Float.parseFloat(valorSaldo);
		Thread.sleep(1000);
		return resultado;
		
	}

}
