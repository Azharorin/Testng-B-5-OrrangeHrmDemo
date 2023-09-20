import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
    @FindBy(name ="username")
    WebElement txtusername;
    @FindBy(css = "[type=password]")
    WebElement txtpassword;
    @FindBy(css="[type=submit]")
    WebElement buttonsubmit;

    public Loginpage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void doingLogin(){
        txtusername.sendKeys("admin");
        txtpassword.sendKeys("admin123");
        buttonsubmit.click();
    }


}
