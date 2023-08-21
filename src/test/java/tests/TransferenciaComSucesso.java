package tests;

import Framework.Reports.Report;
import Framework.Reports.ReportType;
import Framework.Reports.Screenshots;
import Framework.TestBase;
import Tasks.LoginTask;
import com.aventstack.extentreports.Status;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TransferenciaComSucesso extends TestBase {

    private WebDriver driver = this.getDriver();
    LoginTask loginTask = new LoginTask();

    @Test
    public void transferirValor(){

        try {
            Report.cerateTest("Realizar transferencia de valor", ReportType.SINGLE);
            loginTask.efetuarLogin();
        }catch(Exception e){
            Report.log(Status.FAIL , e.getMessage(), Screenshots.capture(driver));
        }






    }


}
