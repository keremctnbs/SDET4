package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _04_FindingByClassName {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
        
        WebElement submitbutton = driver.findElement(By.className("form-submit-button"));
        System.out.println("submitbutton.getText() = " + submitbutton.getText());
        
        // Chrome ctrl+f ye basıldıgında inspect bölümünde
        // first_name yazarsak bütün kelimelerde arar
        // #first_name yazarsak bütün ID parametrelerinde arar
        // .first_name bütün CLASS parametrelerinde arar
        
        //birden fazla aynı locator a sahip eleman bulursa findElement ne yapar ?
        // cevap: ilk element i bulur
        WebElement element=driver.findElement(By.className("form-sub-label"));
        System.out.println("element.getText() = " + element.getText());

        // bu locator a ait elemanların hepsini nasıl alırım ?
        List<WebElement> labeller=driver.findElements(By.className("form-sub-label"));
        System.out.println("labeller.size() = " + labeller.size());
        for (WebElement e:labeller)
            System.out.println("e.getText() = " + e.getText());
        

        // aranılan eleman bulunamazsa : findelement noSuchElement hatası verir
        //findElements ise size ı 0 olan list verir yani hata vermez
        MyFunc.bekle(10);
        driver.quit();

    }
}
