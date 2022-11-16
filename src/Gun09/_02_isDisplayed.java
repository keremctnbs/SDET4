package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_isDisplayed extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies(); // girilikten sonra cookies ler silindi

        MyFunc.bekle(1);
        // //* [text()='Allow essential and optional cookies']
        WebElement cookiesAccept=driver.findElement(By.xpath("//*[text()='Allow essential and optional cookies']"));
        cookiesAccept.click();

        MyFunc.bekle(1);
        WebElement btnyenihesap=driver.findElement(By.linkText("Create New Account"));
        btnyenihesap.click();

        MyFunc.bekle(1);
        WebElement firstname=driver.findElement(By.name("firstname"));
        firstname.sendKeys("kerem");

        MyFunc.bekle(1);
        WebElement lastname=driver.findElement(By.name("lastname"));
        lastname.sendKeys("çetinbaş");

        WebElement reEmail=driver.findElement(By.name("reg_email_confirmation__"));
        //System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed());
        Assert.assertFalse(reEmail.isDisplayed());

        MyFunc.bekle(1);
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("keremcetinbas03@gmail.com");

         reEmail=driver.findElement(By.name("reg_email_confirmation__"));
       //System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed());
        Assert.assertTrue(reEmail.isDisplayed());

        driverBekleKapat();
    }

}
