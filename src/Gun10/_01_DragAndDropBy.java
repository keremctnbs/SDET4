package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class _01_DragAndDropBy extends BaseDriver {
    public static void main(String[] args) {

        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement solSurgu=driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
        // solSurgu.getSize().width;
        //2.sürgü div[id='slider-range']>:nth-child(3)
        MyFunc.bekle(2);

        Actions akisyonlar=new Actions(driver);
        Action aksiyon=akisyonlar.dragAndDropBy(solSurgu,100,0).build();
        MyFunc.bekle(2);

        aksiyon.perform();

        driverBekleKapat();

    }
}
