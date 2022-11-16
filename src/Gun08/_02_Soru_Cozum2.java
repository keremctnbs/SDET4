package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Soru_Cozum2 extends BaseDriver {

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

        //görünmüyor
        WebElement hiddenElement=driver.findElement(By.cssSelector("#fullname_field+div+div"));
        Assert.assertTrue("email girmeden önce gizli durumu",hiddenElement.getAttribute("class").equals("hidden_elem"));

        MyFunc.bekle(1);
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("keremcetinbas03@gmail.com");

        //görünüyor
        hiddenElement=driver.findElement(By.cssSelector("#fullname_field+div+div"));
        Assert.assertFalse("email girdikten sonra gizli durumu",hiddenElement.getAttribute("class").equals("hidden_elem"));

        driverBekleKapat();

    }


    }


