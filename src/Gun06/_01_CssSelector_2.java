package Gun06;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_CssSelector_2 extends BaseDriver {
    @Test
    public void Test1()
    {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesajim="merhaba selenium";
        WebElement txtBox=driver.findElement(By.cssSelector("input[id=['user-message']"));
        txtBox.sendKeys("merhaba selenium");

        WebElement btn=driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        btn.click();

        WebElement msg=driver.findElement(By.cssSelector("span[id='display']"));

  //      if (msg.getText().contains("merhaba selenium"))
        //        System.out.println("test passed");
      //  else
        //    System.out.println("test failed");

        Assert.assertTrue( mesajim+" mesaj bulunamadı" ,msg.getText().contains(mesajim));
        //assertTrue: içindeki değer true mu ? true ise hiçbir şey yapmaz mesaj vermez
        //değilse değilse beklenen olmamışsa hata mesajı verir
        //yani genel kural: hata var ise göster

        driverBekleKapat();



    }

}
