package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_AlertPart3 extends BaseDriver {
    // 3.alerte tıklayınız isminizi alert e yazınız,daha sonra ok a basıp
    // html sayfasında isminizin görüntülendğini assert ile kontrol ediniz

    @Test
    public void Tes1(){

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement ClickMe1=driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
        ClickMe1.click();

        MyFunc.bekle(2);
        driver.switchTo().alert().sendKeys("ismet");
        driver.switchTo().alert().accept();
        MyFunc.bekle(2);

        WebElement txtActual=driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue("beklenen yazı gözükmedi",txtActual.getText().contains("kerem"));

        driverBekleKapat();




        }
}
