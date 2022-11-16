package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Test extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement business=driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        business.click();

        MyFunc.bekle(2);
        WebElement dropDownDiscover=driver.findElement(By.cssSelector("select[id$='_4588']"));
        dropDownDiscover.click();

        driverBekleKapat();


        }
}
