import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Logintestrunner extends Setup {
    DashboardPage dashboardPage;
    Loginpage loginpage;


@Test(priority = 1)
    public void dologin(){

        driver.get("https://opensource-demo.orangehrmlive.com");
        loginpage=new Loginpage(driver);
        loginpage.doingLogin();
        String urlActual= driver.getCurrentUrl();
        String urlExpected="viewEmployeeList";
        //Assert.assertTrue(urlActual.contains(urlExpected));

    }
    @Test(priority = 2)
    public void isProfileImageExists(){
    //junit style el likhteis
        //WebElement imageProfile= driver.findElement(By.className("oxd-userdropdown-img"));
        //profile image asserting or checking
       // Assert.assertTrue(imageProfile.isDisplayed());
        dashboardPage=new DashboardPage(driver);
        Assert.assertTrue(dashboardPage.imageProfile.isDisplayed());
    }
@Test(priority = 3)
    public void selectEmploymentStatus() throws InterruptedException {

    dashboardPage.dropDowns.get(0).click();
    dashboardPage.dropDowns.get(0).sendKeys(Keys.ARROW_DOWN);
        dashboardPage.dropDowns.get(0).sendKeys(Keys.ARROW_DOWN);
        dashboardPage.dropDowns.get(0).sendKeys(Keys.ARROW_DOWN);
        dashboardPage.dropDowns.get(0).sendKeys(Keys.ENTER);
        dashboardPage.submitBtn.click();
         Thread.sleep(5000);
      //List<WebElement> textdata= driver.findElements(By.tagName("span"));
    List<WebElement> textdata= driver.findElements(By.cssSelector("[class='oxd-text oxd-text--span']"));
   // () jehetu "" disi tai class er pore single '' dite hobe
    



        String dataActual=textdata.get(0).getText();
      String dataExpected="Records Found";
      Assert.assertTrue(dataActual.contains(dataExpected));


    }
@Test(priority = 4)
   public void listEmployee() throws InterruptedException {

       JavascriptExecutor js= (JavascriptExecutor) driver;
      // js.executeScript("window.scrollBy(0,documents.body.scrollHeight)");
    js.executeScript("window.scrollBy(600,document.body.scrollHeight)");


   }


}
