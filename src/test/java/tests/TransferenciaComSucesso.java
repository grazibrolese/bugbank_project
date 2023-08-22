package tests;

import Framework.Reports.Report;
import Framework.Reports.ReportType;
import Framework.Reports.Screenshots;
import Framework.TestBase;
import Tasks.LoginTask;
import Tasks.RegistrarContaTask;
import com.aventstack.extentreports.Status;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TransferenciaComSucesso extends TestBase {

    private WebDriver driver = this.getDriver();
    LoginTask loginTask = new LoginTask();
    RegistrarContaTask registroTask = new RegistrarContaTask();

    @Test
    public void transferirValor() {

        try {
            Report.cerateTest("Realizar transferencia de valor", ReportType.SINGLE);
           // loginTask.efetuarLogin();
            registroTask.efetuarRegistro();
        }catch(Exception e){
            Report.log(Status.FAIL , e.getMessage(), Screenshots.capture(driver));
        }


    }
}






