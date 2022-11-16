package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionDragAndDropTest extends BaseDriver {

    @Test
    public void Tes1()
    {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement oslo=driver.findElement(By.id("box1"));
        WebElement norvec=driver.findElement(By.id("box101"));

        //1.yöntem
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.dragAndDrop(oslo,norvec).build();
        aksiyon.perform();

        //2.yöntem
        WebElement seul=driver.findElement(By.id("box5"));
        WebElement kore=driver.findElement(By.id("box105"));
        aksiyon=aksiyonlar.clickAndHold(seul).build();
        aksiyon.perform(); // suruklenecek elementi mousla tuttum
       // new Actions(driver).clickAndHold(seul).build().perform(); // kısa yol


        aksiyon=aksiyonlar.moveToElement(kore).release().build();
        aksiyon.perform(); // hedef e götür(movetoelement) ve bırak(release)
        //new Actions(driver).moveToElement(kore).release().build().perform(); // kısa yol


        MyFunc.bekle(2);
        driverBekleKapat();
    }
}
