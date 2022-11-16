package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _05_ActionHoverOver extends BaseDriver {

    //Jewellery -> Neckless -> Bib Neckless click
    //tıklatma işleminden sonra URL de
   //bib-necklaces kelimesinin geçtiğini doğrulayın.

    @Test
    public void Test1(){


        driver.get("https://www.etsy.com/");

        // 1-isDisplay ve isEnable gibi kontrooller element Html nin çinde var fakat görünür değil
        // durumunda kullanılır
        // 2-bazı durumlarda element HTML nin içinde hiç yoktur

        List<WebElement> cookiesAccept=driver.findElements(By.cssSelector("[data-gdpr-single-choice-accept='true']"));
        // elementi bulamazsa imlicity wait devreye girer ve verilen süre kadar bulmaya çalışır
        if (cookiesAccept.size() > 0) // varsa
            cookiesAccept.get(0).click(); // kapat



        WebElement mucevher=driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement kolye=driver.findElement(By.id("side-nav/category-link-10873"));
        WebElement bibkolye=driver.findElement(By.id("catnav-l3-10881"));

        Actions aksiyonlar=new Actions(driver);

        aksiyonlar.moveToElement(mucevher).build().perform();
        MyFunc.bekle(2);
        aksiyonlar.moveToElement(kolye).build().perform();
        MyFunc.bekle(2);
        aksiyonlar.moveToElement(bibkolye).build().perform();
        MyFunc.bekle(2);

        bibkolye.click();

        Assert.assertTrue("url de bib kolye var mı",driver.getCurrentUrl().contains("bib"));

        driverBekleKapat();









    }
}
