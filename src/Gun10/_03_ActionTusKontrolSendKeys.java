package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionTusKontrolSendKeys extends BaseDriver {

        @Test
        public void Test1(){


        driver.get("https://demoqa.com/auto-complete");

            WebElement element=driver.findElement(By.id("autoCompleteSingleInput"));

            Actions aksiyonlar= new Actions(driver);

            Action aksiyon=aksiyonlar
                    .moveToElement(element)  //kutucuğa git
                    .click()                 //içine tıklat
                    .keyDown(Keys.SHIFT)     //shift bas
                    .sendKeys("a")           // a ya bas
                    .keyUp(Keys.SHIFT)       //shifti bırak
                    .sendKeys("hmet")        //hmet yaz
                    .build();

            MyFunc.bekle(2);
            aksiyon.perform();

            driverBekleKapat();


    }
}
