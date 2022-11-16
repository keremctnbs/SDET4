package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionClickTest extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://demoqa.com/buttons");

        WebElement element=driver.findElement(By.xpath("//button[text()='Click me']"));
        //element.click(); normal click

        Actions aksiyonlar=new Actions(driver);
        System.out.println("aksiyon öncesi tüm aksiyonları çalıştıracağımız ana aksiyonlar sınıfı oluşturuldu");

        Action aksiyon=aksiyonlar.moveToElement(element).click().build();

        System.out.println("aksiyon hazırlandı");

        MyFunc.bekle(2);
        aksiyon.perform(); // aksiyonu gerçekleştirir
        System.out.println("aksiyon gerçekleşti");

        driverBekleKapat();

    }
}
