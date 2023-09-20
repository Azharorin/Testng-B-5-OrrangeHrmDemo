import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {
    @FindBy(className = "oxd-userdropdown-img")

    WebElement imageProfile;

    @FindBy (className = "oxd-select-text-input")
   List<WebElement > dropDowns;

    @FindBy(css = "[type=submit]")
    WebElement submitBtn;


    public DashboardPage(WebDriver driver){
        PageFactory.initElements(driver,this
        );
    }
}
