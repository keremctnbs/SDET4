package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_AlertPart2 extends BaseDriver {

    @Test
    public void Tes1(){

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement ClickMe1=driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
        ClickMe1.click();

        MyFunc.bekle(2);
        driver.switchTo().alert().dismiss(); //alert kutucuğuna geçildi ve Cancel(iptal) butonuna basıldı

        MyFunc.bekle(5);

        driverBekleKapat();




        }
}
