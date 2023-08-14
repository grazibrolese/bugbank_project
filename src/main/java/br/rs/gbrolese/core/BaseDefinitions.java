package br.rs.gbrolese.core;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static br.rs.gbrolese.core.DriverFactory.getDriver;
import static br.rs.gbrolese.core.DriverFactory.killDriver;


public class BaseDefinitions  {

	
	@Rule
	public TestName testName = new TestName();

	@Before
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("https://bugbank.netlify.app//");
		}

	@After
	public void finaliza() throws IOException{
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
				File.separator + testName.getMethodName() + ".jpg"));
		
		if(Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}
	

}
