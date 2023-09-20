import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Setup {
    WebDriver driver;

@BeforeTest
    public void setup(){

       // WebDriverManager.chromedriver().setup();
    WebDriverManager.firefoxdriver().setup();

     driver = new FirefoxDriver();

       // driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }




}
