package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_SenaryoXpath extends BaseDriver {

    @Test
    public void Test1 ()
    {
        driver.get("https://www.saucedemo.com/ ");

        WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");
        MyFunc.bekle(2);

        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        username.sendKeys("secret_sauce");
        MyFunc.bekle(2);

        WebElement loginButton=driver.findElement(By.xpath("//input[@id='Login-button']"));
        loginButton.click();
        MyFunc.bekle(2);

        //1.ürün
        

        driverBekleKapat();




    }
}
