package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver {
    public static void main(String[] args) {




        driver.get("https://www.hepsiburada.com");

       List<WebElement> linkler= driver.findElements(By.tagName("a"));//tag ına göre bulma
        //bu bana sayfadaki tüm linkleri verir.

        for (WebElement e:linkler)
            if (e.getText().equals("")) // kırık link yani ekranda gözüken kısmı yok
            {
                System.out.println("link.getAttribute(href) = " + e.getAttribute("href") );
                System.out.println("link.getAttribute(title)= " + e.getAttribute("title"));
                System.out.println("link.getAttribute(rel) = " + e.getAttribute("rel"));
            }

        driverBekleKapat();

    }
}
