package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://form.jotform.com/221934510376353");

        try {


        WebElement element = driver.findElement(By.id("sublabel_8_firs"));
        System.out.println("element.getText() = " + element.getText());

    }catch (Exception ex){
            System.out.println("eleman bulunamadı = " + ex.getMessage());
        }


        MyFunc.bekle(10);
        driver.quit();
    }


}
