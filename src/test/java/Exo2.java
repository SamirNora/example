import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Exo2 {

   // private final static Logger logger = Logger.getLogger(ExtentReportClass.class);

    private WebDriver driver1;


    @BeforeTest
    public void startTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\IntelliJ\\IntelliJ IDEA\\chromedriver\\chromedriver1.exe");
        driver1 = new SafariDriver();
        driver1.manage().window().maximize();
        driver1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //initialze reports
      //  String work = System.getProperty("user.dir");
      //  extest=new ExtentReports(work+"\\ExtentReports\\ExtentReportResults.html", true);
        //reports = new ExtentReports(new SimpleDateFormat("yyyy-MM-dd hh-mm-ss-ms").format(new Date()) + "reports.html");
        // extest.addSystemInfo("Host Name","software Testing Material");
        // extest.addSystemInfo("Environnement","Automation Testing");
        // extest.loadConfig(new File(System.getProperty("user.dir")+"\\config.xml"));
        sleep(1000);

    }

    @Test
    public void passTest() throws IOException, InterruptedException {
        driver1.get("http://facebook.com/");

}
}


