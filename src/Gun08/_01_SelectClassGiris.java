package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _01_SelectClassGiris extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.amazon.com/");

        WebElement webMenu=driver.findElement(By.id("searchDropdownBox"));

        Select ddmenu=new Select(webMenu);

        ddmenu.deselectByVisibleText("Books");
        MyFunc.bekle(1);

        WebElement srcButton=driver.findElement(By.id("nav-search-submit-button"));
        srcButton.click();

        WebElement element=driver.findElement(By.xpath("//h2[text()='Best sellers']"));

        Assert.assertTrue(element.getText().contains("Best sellers"));

        driverBekleKapat();
    }
}
