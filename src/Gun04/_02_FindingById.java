package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) {


            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://form.jotform.com/221934510376353");

           WebElement name= driver.findElement(By.id("first_8"));//elemanı bulma
           name.sendKeys("kerem");// kutucuklara yazı gönderme
        
           WebElement label1=driver.findElement(By.id("sublabel_8_first"));
        System.out.println("label1.getText() = " + label1.getText());

        WebElement name2=driver.findElement(By.id("last_8"));
        name2.sendKeys("çetinbaş");
           

        MyFunc.bekle(5);
        driver.quit();

    }
}
